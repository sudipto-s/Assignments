package P1;

public class Student {
    String name;
    int roll;
    public void inputS(String n, int r) {
        name = n;
        roll = r;
    }
    public void outputS() {
        System.out.println("Name: "+name+"\tRoll: "+roll);
    }
}
