 
package com.teyyub.repository.impl;


import com.teyyub.model.Customers;
import com.teyyub.repository.CustomerRepository;
import java.util.List;

/**
 *
 * @author USER
 */
public class inMemoryCustomerRepository implements CustomerRepository{

    @Override
    public List<Customers> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
