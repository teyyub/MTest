package com.teyyub.service.impl;


import com.teyyub.model.Cart;
import com.teyyub.repository.CartRepository;
import com.teyyub.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        cartRepository.update(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
       cartRepository.delete(cartId);
    }

}
