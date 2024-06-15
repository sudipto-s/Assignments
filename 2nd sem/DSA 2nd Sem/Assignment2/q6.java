abstract class Shape {
    abstract double getArea();
}
class Square extends Shape {
    double s;
    Square(double sd) {
        s = sd;
    }
    double getArea() {
        return s * s;
    }
}
class Triangle extends Shape {
    double l, b;
    Triangle(double le, double br) {
        l = le;
        b = br;
    }
    double getArea() {
        return 0.5 * l * b;
    }
}
class Circle extends Shape {
    double r;
    Circle(double ra) {
        r = ra;
    }
    double getArea() {
        return Math.PI * r * r;
    }
}
class q6 {
    public static void main(String[] args) {
        Shape s1 = new Triangle(2, 4);
        Shape s2 = new Circle(5.6);
        Shape s3 = new Square(8);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        System.out.println(s3.getArea());
    }
}