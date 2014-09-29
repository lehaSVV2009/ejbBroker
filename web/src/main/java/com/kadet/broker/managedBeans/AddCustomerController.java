package com.kadet.broker.managedBeans;

import com.kadet.broker.entity.Customer;
import com.kadet.broker.model.Model;
import com.kadet.broker.util.Strings;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 * Date: 29.09.14
 * Time: 5:23
 *
 * @author SarokaA
 */
@ManagedBean(name = "addCustomerController")
public class AddCustomerController extends CustomerController {

    public String addCustomer () {
        model.addCustomer(customer);
        return Strings.INDEX + Strings.FACETS_REDIRECT_TRUE;
    }
}
