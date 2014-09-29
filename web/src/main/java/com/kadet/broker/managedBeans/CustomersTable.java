package com.kadet.broker.managedBeans;

import com.kadet.broker.entity.Customer;
import com.kadet.broker.model.Model;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Date: 29.09.14
 * Time: 3:32
 *
 * @author SarokaA
 */
@ManagedBean(name = "customersTable")
public class CustomersTable {

    @EJB(name = "dataModel")
    private Model model;

    public List<Customer> getCustomers () {
        System.out.println("customers table model: " + model);
        return model.getCustomers();
    }

}
