
abstract class Shape {
    public abstract double calcArea();
    public abstract double calcPeri();
}

class Circle extends Shape {
    public double r;
    
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return 3.14 * r * r;
    }

    @Override
    public double calcPeri() {
        return 2 * 3.14 * r;
    }
}

class Triangle extends Shape {
    public double b, h, a;
    
    public Triangle(double b, double h, double a) {
        this.b = b;
        this.h = h;
        this.a = a;
    }

    @Override
    public double calcArea() {
        return b * h * 0.5;
    }

    @Override
    public double calcPeri() {
        return a + b + h;
    }
}

public class Shapessss {
    public static void main(String[] args) {
        Shape cir = new Circle(4);
        Shape tri = new Triangle(4, 5, 6);
        
        System.out.println("Circle Area: " + cir.calcArea());
        System.out.println("Circle Perimeter: " + cir.calcPeri());
        
        System.out.println("Triangle Area: " + tri.calcArea());
        System.out.println("Triangle Perimeter: " + tri.calcPeri());
    }
}
