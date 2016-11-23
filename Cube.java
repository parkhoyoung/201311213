package com.hy.ch8;

class Cube extends Rectangle {
    double height;
    public Cube(double l, double w, double h) {
        super(l,h);
        this.height=w;
    }
    public double getHeight() {
        return height;
    }
}