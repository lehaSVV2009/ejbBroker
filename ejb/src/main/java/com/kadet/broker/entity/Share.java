package com.kadet.broker.entity;

/**
 * Date: 22.05.14
 * Time: 14:18
 *
 * @author SarokaA
 */
public class Share implements Entity {

    private int id;

    private Stock stockTO;
    private int quantity;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public Stock getStockTO () {
        return stockTO;
    }

    public void setStockTO (Stock stockTO) {
        this.stockTO = stockTO;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
}
