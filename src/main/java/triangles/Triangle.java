package triangles;

import java.text.DecimalFormat;

public class Triangle implements Comparable<Triangle> {
    private String name;
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double square = 0;

    public Triangle() {
    }

    public Triangle(String name, double a, double b, double c) throws TriangleCantExist {
        if (a != 0 && b != 0 && c != 0) {
            if (triangleMayExist(a, b, c)) {
                this.name = name;
                this.a = a;
                this.b = b;
                this.c = c;
                this.square = Triangle.square(a, b, c);
            } else {
                throw new TriangleCantExist("Wrong side size");
            }
        } else {
            throw new TriangleCantExist("Size can't be 0");
        }
    }

    private double getSquare() {
        return square;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private static double square(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String
    toString() {
        String formattedSquare = new DecimalFormat("#0.00").format(square);
        return "[Triangle " + name + "]: " + formattedSquare + " cm";
    }

    static private boolean triangleMayExist(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > a) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Triangle t) {
        if (square == t.getSquare()) {
            return 0;
        } else if (square > t.getSquare()) {
            return -1;
        } else {
            return 1;
        }
    }

}

class TriangleCantExist extends Exception {
    public TriangleCantExist(String message){
        super(message);
    }

}
