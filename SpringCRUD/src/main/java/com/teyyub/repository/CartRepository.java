package com.teyyub.repository;

import com.teyyub.model.Cart;

/**
 *
 * @author USER
 */
public interface CartRepository {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
