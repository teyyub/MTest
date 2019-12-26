package com.teyyub.controller;

import com.teyyub.model.Cart;
import com.teyyub.model.CartItem;
import com.teyyub.model.Product;
import com.teyyub.service.CartService;
import com.teyyub.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author teyyub , 4:26:47 PM
 */
@Controller
@RequestMapping(value = "rest/cart")
public class CartRestController {

    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody 
        Cart create(@RequestBody Cart cart) {
        System.out.println("create");
        return cartService.create(cart);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public @ResponseBody
    Cart read(@PathVariable(value = "cartId") String cartId) {
        System.out.println("read");
        return cartService.read(cartId);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "cartId") String cartId, @RequestBody Cart cart) {
        System.out.println("update");
        cartService.update(cartId, cart);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "cartId") String cartId) {
        System.out.println("delete");
        cartService.delete(cartId);
    }

    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable String productId, HttpServletRequest request) {
        System.out.println("addItem");
        String sessionId = request.getSession(true).getId();
        Cart cart = cartService.read(sessionId);
        if (cart == null) {
            cart = cartService.create(new Cart(sessionId));
        }
        Product product = productService.getProductById(productId);
        if (product == null) {
//            throw new IllegalArgumentException(new ProductNotFoundException(productId));
        }
        cart.addCartItem(new CartItem(product));
        cartService.update(sessionId, cart);
    }

    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String productId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Cart cart = cartService.read(sessionId);
        if (cart == null) {
            cart = cartService.create(new Cart(sessionId));
        }
        Product product = productService.getProductById(productId);
        if (product == null) {
//            throw new IllegalArgumentException(new ProductNotFoundException(productId));
        }
        cart.removeCartItem(new CartItem(product));
        cartService.update(sessionId, cart);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request , please verify your payload")
    public void handleClientErrors(Exception ex) {
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void handleServerErrors(Exception ex) {
    }
}