package com.kadet.broker.managedBeans;

import com.kadet.broker.entity.Customer;
import com.kadet.broker.util.Strings;

import javax.faces.bean.ManagedBean;

/**
 * Date: 29.09.14
 * Time: 6:10
 *
 * @author SarokaA
 */
@ManagedBean(name = "removeCustomerController")
public class RemoveCustomerController extends CustomerController {

    public String removeCustomer (String id) {
        model.removeCustomer(id);
        return Strings.INDEX + Strings.FACETS_REDIRECT_TRUE;
    }

}
