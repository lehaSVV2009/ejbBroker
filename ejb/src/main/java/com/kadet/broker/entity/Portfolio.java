package com.kadet.broker.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 29.09.14
 * Time: 4:33
 *
 * @author SarokaA
 */
public class Portfolio implements Entity {

    private Customer customer;
    private List<Share> shares = new ArrayList<>();

}
