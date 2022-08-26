package org.example;

import org.example.solid.*;

import java.util.List;


public class App {
    public static void main( String[] args ) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        Square square = new Square(10);
        Circle circle = new Circle(10);
        Cube cube = new Cube(10);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        List<Shape> shapes = List.of(circle, square, cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
