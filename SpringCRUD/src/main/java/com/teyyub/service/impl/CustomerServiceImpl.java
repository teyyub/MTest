package com.teyyub.service.impl;

 
import com.teyyub.model.Customers;
import com.teyyub.service.CustomerService;
import java.util.List;

/**
 *
 * @author USER
 */
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customers> getAllCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Autowired
//    private InMemoryCustomerRepository customerRepository;
//
//    @Override
//    public List<Customers> getAllCustomers() {
//        throw new Invalid();
////        return customerRepository.getAllCustomers();
//    }

}
