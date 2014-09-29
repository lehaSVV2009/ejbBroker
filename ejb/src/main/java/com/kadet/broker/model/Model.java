package com.kadet.broker.model;

import com.kadet.broker.entity.Customer;

import java.util.List;

/**
 * Date: 29.09.14
 * Time: 4:55
 *
 * @author SarokaA
 */
public interface Model {

    public void addCustomer (Customer customer);

    public List<Customer> getCustomers ();

    public boolean updateCustomer (Customer customer);

    public void removeCustomer (String customer);

}
