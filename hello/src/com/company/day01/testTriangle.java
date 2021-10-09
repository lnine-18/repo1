package com.company.day01;

class testTriangle {
    private double a, b, c;

    public testTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean istriangle() {
        if ((a + b) > c && (a + c > b) && (b + c) > a) {
            return true;
        } else return false;
    }

    public double peretriangle() {
        return a + b + c;
    }

    public double areatriangle() {
        double area, temp;
        temp = 0.5 * (a + b + c);
        area = Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
        return area;
    }
}
