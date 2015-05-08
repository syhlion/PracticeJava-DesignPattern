package com.syhlion;

import com.syhlion.Creational.AbstractFactory.Corner;
import com.syhlion.Creational.AbstractFactory.Point;
import com.syhlion.Creational.AbstractFactory.PointConrnerFactory;
import com.syhlion.Creational.AbstractFactory.Rectangle;

/**
 * Created by scott on 2015/5/7.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,10);
        PointConrnerFactory factory = new PointConrnerFactory() {
            @Override
            public Corner getCorner() {
                return new Corner() {
                    @Override
                    public void leftUp() {
                        System.out.print("+");
                    }

                    @Override
                    public void rightUp() {
                        System.out.print("+");
                    }

                    @Override
                    public void leftDown() {
                        System.out.print("+");
                    }

                    @Override
                    public void rightDown() {
                        System.out.print("+");
                    }
                };
            }

            @Override
            public Point getPoint() {

                return new Point() {
                    @Override
                    public void line(int width) {
                        for (int i = 0; i < width; i++) {
                            System.out.print("-");

                        }
                    }
                };
            }

        };
        rectangle.paint(factory);

    }
}
