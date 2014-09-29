package com.kadet.broker.model;

import com.kadet.broker.entity.Customer;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 29.09.14
 * Time: 4:35
 *
 * @author SarokaA
 */
@Stateful(name = "dataModel")
@Singleton
public class DataModel implements Model {

    private List<Customer> customers = new ArrayList<>();

    {
        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("Alex");
        customer.setAddress("Chapaeva");
        Customer customer2 = new Customer();
        customer2.setId("2");
        customer2.setName("Alex");
        customer2.setAddress("Chapaeva");
        Customer customer3 = new Customer();
        customer3.setId("3");
        customer3.setName("Alex");
        customer3.setAddress("Chapaeva");
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);

    }

    public void addCustomer (Customer customer) {
        customers.add(customer);
        System.out.println("customer was added: " + customer);
    }

    public List<Customer> getCustomers () {
        return customers;
    }

    @Override
    public boolean updateCustomer (Customer newCustomer) {
        for (Customer customer : customers) {
            if (customer.getId().equals(newCustomer.getId())) {
                customer.setId(newCustomer.getId());
                return true;
            }
        }
        return false;
    }


    public void removeCustomer (String customerId) {
        for (Customer customer : customers) {
            if (customerId.equals(customer.getId())) {
                customers.remove(customer);
                return;
            }
        }
    }


}
