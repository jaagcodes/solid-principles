package org.example.solid;

public class Cube implements Shape, ThreeDimensionalShape{

    private final int length;

    public Cube(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }


    @Override
    public int area() {
        return (int)(Math.pow(getLength(), 2) * 4);
    }

    @Override
    public double volume() {
        return (int)(Math.pow(getLength(), 2));
    }
}
