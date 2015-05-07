package com.syhlion.Creational.SimpleFactory;

import com.syhlion.Creational.SimpleFactory.Product;

/**
 * Created by scott on 2015/5/7.
 */
public class ProductFactory {
    public static Product getProduct(){
        return new Product() {
            @Override
            public String getName() {
                return "test";
            }
        };
    }
}
