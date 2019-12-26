package com.teyyub.model;

import java.math.BigDecimal;

/**
 *
 * @author USER
 */
public class CartItem {

    private Product product;
    private int quantity;
    private BigDecimal totalPrice;

    public CartItem() {
    }

    public CartItem(Product product) {
        this.product = product;
        this.quantity = 1;
        this.totalPrice = product.getUnitPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.updateTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void updateTotalPrice() {
        totalPrice
                = this.product.getUnitPrice().multiply(new BigDecimal(this.quantity));
    }
}
