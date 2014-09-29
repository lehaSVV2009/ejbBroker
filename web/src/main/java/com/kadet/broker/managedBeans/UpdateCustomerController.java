package com.kadet.broker.managedBeans;

import com.kadet.broker.entity.Customer;
import com.kadet.broker.util.Strings;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Date: 29.09.14
 * Time: 5:56
 *
 * @author SarokaA
 */
@ManagedBean(name = "updateCustomerController")
@javax.faces.bean.SessionScoped
public class UpdateCustomerController extends CustomerController implements Serializable {

    public String goToUpdatePage (Customer customer) {
        this.customer = customer;
        return Strings.UPDATE_CUSTOMER + Strings.FACETS_REDIRECT_TRUE;
    }

    public String updateCustomer () {
        model.updateCustomer(customer);
        return Strings.INDEX + Strings.FACETS_REDIRECT_TRUE;
    }

}
