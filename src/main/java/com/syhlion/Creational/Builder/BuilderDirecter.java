package com.syhlion.Creational.Builder;

/**
 * Created by scott on 2015/5/8.
 */
public class BuilderDirecter {
    private CustomerBuilder builder;
    private String name;
    private int phone;
    public BuilderDirecter(CustomerBuilder builder) {
        this.builder = builder;
    }

    public BuilderDirecter setPhone(int phone){
        this.phone = phone;
        return this;
    }
    public BuilderDirecter setName(String name){
        this.name = name;
        return this;
    }

    public Customer build(){
        return new BussinessCustomer(this.phone, this.name);
    }


}
