import java.util.*;
class Student {
    String name;
    int roll;
    double marks;
    void getData(int r, String n, double m) {
        roll = r;
        name = n;
        marks = m;
    }
    void show() {
        System.out.println(name+"\t"+roll+"\t"+marks);
    }
}
public class q3 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            System.out.println("Enter name, roll number & marks:");
            s[i].getdata(sc.next(), sc.nextInt(), sc.nextDouble());
        } sc.close(); 
        System.out.println("Name\t"+"Roll\t"+"Marks");
        for (int i = 0; i < s.length; i++)
            s[i].show();
        double max = s[0].marks;
        int m_index = 0;
        for (int i = 0; i < s.length; i++)
            if (max < s[i].marks)
                m_index = i;
        System.out.println("Highest marks scored by "+s[m_index].name+" scoring "+s[m_index].marks+" Roll number "+s[m_index].roll);
    }
}
