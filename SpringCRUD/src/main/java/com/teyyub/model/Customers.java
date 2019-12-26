package com.teyyub.model;

/**
 *
 * @author USER
 */
public class Customers {

    private String customerId;
    private String name;
    private String address;
    private String noOfOrdersMade;

    public Customers(String customerId, String name, String address, String noOfOrdersMade) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(String noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }
    
    
    
    
}
