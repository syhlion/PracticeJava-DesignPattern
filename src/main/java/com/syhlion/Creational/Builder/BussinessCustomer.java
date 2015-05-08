package com.syhlion.Creational.Builder;

/**
 * Created by scott on 2015/5/8.
 */
public class BussinessCustomer implements Customer{

    private int phone;
    private String name;

    public BussinessCustomer(int phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public int getPhone() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
