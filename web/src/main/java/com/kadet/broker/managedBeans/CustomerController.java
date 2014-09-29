package com.kadet.broker.managedBeans;

import com.kadet.broker.entity.Customer;
import com.kadet.broker.model.Model;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 * Date: 29.09.14
 * Time: 6:09
 *
 * @author SarokaA
 */
public abstract class CustomerController {

    protected Customer customer;

    @EJB(name = "dataModel")
    protected Model model;

    @PostConstruct
    public void init () {
        customer = new Customer();
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
    }

    public Model getModel () {
        return model;
    }

    public void setModel (Model model) {
        this.model = model;
    }


}
