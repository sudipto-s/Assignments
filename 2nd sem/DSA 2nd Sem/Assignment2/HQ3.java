class Distance {
    private double meters, centimeters;
    Distance(double m, double cm) {
        meters = m;
        centimeters = cm;
    }
    void display() {
        System.out.println("Meters: "+meters+"\tCentimeters: "+centimeters);
    }
    Distance sum(Distance d1, Distance d2) {
        double dm = d1.meters + d2.meters;
        double dc = d1.centimeters + d2.centimeters;
        return new Distance(dm, dc);
    }
}
public class HQ3 {
    public static void main(String[] args) {
        Distance d1 = new Distance(2, 36);
        Distance d2 = new Distance(5, 71);
        d1.display();
        d2.display();
        Distance d3 = d1.sum(d2, d1);
        d3.display();
    }
}
