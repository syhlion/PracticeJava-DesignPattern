package com.syhlion.Creational.AbstractFactory;

/**
 * Created by scott on 2015/5/8.
 */
public class Rectangle {

    private int width;
    private int heigth;

    public Rectangle(int width, int height) {
        this.width = width;
        this.heigth = height;
    }

    public void paint(PointConrnerFactory factory){
        Corner conner = factory.getCorner();
        Point point = factory.getPoint();

        conner.leftUp();
        point.line(this.width - 2);
        conner.rightUp();
        System.out.println();

        for(int i = 0; i< this.heigth-4 ;i++) {
            point.line(this.width);
            System.out.println();
        }

        conner.leftDown();
        point.line(this.width - 2);
        conner.rightDown();
        System.out.println();

    }
}
