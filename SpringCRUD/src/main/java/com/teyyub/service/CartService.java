package com.teyyub.service;

import com.teyyub.model.Cart;

 

/**
 *
 * @author USER
 */
public interface CartService {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
