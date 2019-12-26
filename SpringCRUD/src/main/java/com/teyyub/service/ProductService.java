package com.teyyub.service;


import com.teyyub.model.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author USER
 */
public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(String productID);

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    void addProduct(Product product);
}
