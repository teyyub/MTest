package com.teyyub.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author teyyub , 5:47:31 PM
 */
@Controller
@RequestMapping(value = "/cart")
public class CartController {

    @RequestMapping("/cart")
    public String get(HttpServletRequest request) {
        return "redirect:/cart/" + request.getSession(true).getId();
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public String getCart(@PathVariable(value = "cartId") String cartId, Model model) {
        model.addAttribute("cartId", cartId);
        return "cart";
    }
}
