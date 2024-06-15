class PointType {
    double xCor, yCor;
    PointType(double x, double y) {
        xCor = x;
        yCor = y;
    }
    void setCor(double x, double y) {
        xCor = x;
        yCor = y;
    }
    void getCor() {
        System.out.println("("+xCor+", "+yCor+")");
    }
    double getX() {
        return xCor;
    }
    double getY() {
        return yCor;
    }
}
class CircleType extends PointType {
    double radius, center;
    CircleType(double x, double y, double r) {
        super(x, y);
        radius = r;
    }
    void setR(double r) {
        radius = r;
    }
    void getR() {
        System.out.println("Radius: "+radius);
    }
    void getCenter() {
        System.out.println("Center: ("+this.xCor+", "+this.yCor+")");
    }
    void getArea() {
        System.out.println("Area: "+( Math.PI * radius * radius));
    }
    void getCircumferance() {
        System.out.println("Circumferance: "+( 2 * Math.PI * radius));
    }
}
public class HQ4 {
    public static void main(String[] args) {
        CircleType c = new CircleType(1, 2, 5);
        c.getCor();
        c.setCor(8, 9);
        System.out.println("("+c.getX()+", "+c.getY()+")");
        c.getR();
        c.setR(10);
        c.getR();
        c.getCenter();
        c.getArea();
        c.getCircumferance();
    }
}
