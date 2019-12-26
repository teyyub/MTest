package com.teyyub.service.impl;

 
import com.teyyub.model.Product;
import com.teyyub.repository.ProductRepository;
import com.teyyub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int quantity) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < quantity) {
            throw new IllegalArgumentException(
                    "Out of Stock. Available Units in stock" + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock()- quantity);
    }

}
