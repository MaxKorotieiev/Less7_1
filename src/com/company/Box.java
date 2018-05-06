package com.company;

public class Box {
    private double width;
    private double height;
    private double depth;
    private double vol;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", volume=" + vol +
                '}';
    }
}

