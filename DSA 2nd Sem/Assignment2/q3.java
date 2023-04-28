import java.util.*;
class q3 {
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
    public static void main(String[] args) {
        q3[] s = new q3[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            s[i] = new q3();
            // System.out.println("Enter name, roll number & marks:");
            // s[i].name = sc.next();
            // s[i].roll = sc.nextInt();
            // s[i].marks = sc.nextDouble();
        } sc.close();
        s[0].getData(0125, "Abc", 85.5);
        s[1].getData(8974, "shv", 87);
        s[2].getData(0501, "jjad", 54.5);
        s[3].getData(0547, "nsdj", 45);
        s[4].getData(0247, "cvhd", 59.5); 
        System.out.println("Name\t"+"Roll\t"+"Marks");
        for (int i = 0; i < s.length; i++)
            s[i].show();
        double max = s[0].marks;
        int m_index = 0;
        for (int i = 0; i < s.length; i++)
            if (max < s[i].marks) {
                max = s[i].marks;
                m_index = i;
            }
        System.out.println("Highest marks scored by "+s[m_index].name+" scoring "+s[m_index].marks+" Roll number "+s[m_index].roll);
    }
}
