package com.teyyub.repository;

 
import com.teyyub.model.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author USER
 */
public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    void addProduct(Product product);
}
