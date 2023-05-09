import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employe[] e = new Employe[2];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employe("Sudipta", "manager", 1258, 59000+i, "911234567890", "ITER, Bhubaneshwar", "India", 851030, 5, 6, 2015);
        } sc.close();
        // for (int i = 0; i < e.length; i++)
        //     e[i].getDetails();
        arrangeEmployeeBySalary(e);
        getEmployeeByJobPosition(e, "manager");
        foreignEmployeeCount(e);
    }
    public static void arrangeEmployeeBySalary(Employe[] e) {
        for (int i = 0; i < e.length; i++)
            for (int j = 0; j < e.length; j++) {
                if(e[i].salary > e[j].salary) {
                    Employe temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
    }
    public static void getEmployeeByJobPosition(Employe[] e, String jp) {
        for (int i = 0; i < e.length; i++)
            if (e[i].jobPosition == jp)
                e[i].getDetails();
    }
    /*public static void getEmployeeByHireDate(Employe[] e, Date d1, Date d2) {
        for (int i = 0; i < e.length; i++) {
            int d = e[i].day, m = e[i].month, y = e[i].year;
            if ((d >= d1.day && d <= d2.day) && (m >= d1.month && m <= d2.month) && (y >= d1.year && y <= d2.year))
                e[i].getDetails();
        }
    } */
    public static void foreignEmployeeCount(Employe[] e) {
        int c = 0;
        for (int i = 0; i < e.length; i++)
            if ((e[i].contactNumeber.substring(0, 2) != "91"))
                c++;
        System.out.println("Number of Foreign employee(s): "+c);
    }
    public static void getEmployeeBySalary(Employe[] e, double s1, double s2) {
        
    }
}







// To populate Employee
/*System.out.println("Enter details");
            String name = sc.next();
            String jobP = sc.next().toLowerCase();
            String cNum = sc.next();
            int eId = sc.nextInt();
            double salry = sc.nextDouble();
            String stre = sc.next();
            String cit = sc.next();
            String sta = sc.next();
            String coun = sc.next();
            int pin = sc.nextInt();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            e[i] = new Employe(name, jobP, cNum, eId, salry, stre, cit, sta, coun, pin, d, m, y); */
