package com.kadet.broker.entity;

/**
 * Date: 29.09.14
 * Time: 4:32
 *
 * @author SarokaA
 */
public class Customer implements Entity {

    private String id;
    private String name;
    private String address;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }
}
