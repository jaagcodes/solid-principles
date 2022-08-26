package org.example.solid;

public class Square implements Shape{

    private final int length;

    public Square(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    public int area() {
        return (int) Math.pow(getLength(),2);
    }
}
