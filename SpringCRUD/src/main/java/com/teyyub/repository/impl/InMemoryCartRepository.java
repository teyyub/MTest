package com.teyyub.repository.impl;


import com.teyyub.model.Cart;
import com.teyyub.repository.CartRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class InMemoryCartRepository implements CartRepository {

    private Map<String, Cart> listOfCarts;

    public InMemoryCartRepository() {
        listOfCarts = new HashMap<>();
    }

    @Override
    public Cart create(Cart cart) {
        if (listOfCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("Can not createa cart. A cart with the give id (%) aldrady exist", cart.getCartId()));
        }
        listOfCarts.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Can not updatecart.The cart with the give id (%) does not does not exist", cartId));
        }
        listOfCarts.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Can not deletecart. The cart with the give id (%) does not does not exist", cartId));
        }
        listOfCarts.remove(cartId);
    }

}
