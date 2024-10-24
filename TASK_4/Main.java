package TASK_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Square square1 = new Square(5);
        System.out.println("cirklens areal: " + circle1.getArea());
        System.out.println("kvadratens areal: " + square1.getArea());

        ShapeBuilder list1 = new ShapeBuilder();
        list1.addShape(circle1);
        list1.addShape(square1);
        System.out.println("Total areal : " + list1.getTotalArea());



        }

    }
