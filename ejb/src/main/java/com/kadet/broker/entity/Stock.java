package com.kadet.broker.entity;


/**
 * Date: 22.05.14
 * Time: 14:16
 *
 * @author SarokaA
 */
public class Stock implements Entity {

    private String symbol;
    private float price;

    public float getPrice () {
        return price;
    }

    public void setPrice (float price) {
        this.price = price;
    }

    public String getId () {
        return symbol;
    }

    public void setId (String id) {
        this.symbol = id;
    }
}
