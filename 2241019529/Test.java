import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[2];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee("Ajshb", "Manager", 1258, 58000, "584779", "L1, Bh, Od", "IN", 751030, 25, 05, 2015);
        } sc.close();
        for (int i = 0; i < e.length; i++) {
            e[i].getDetails();
        }
        /*public static void arrangeEmployeeBySalary(Employe[] e) {
            for (int i = 0; i < e.length; i++) {
                
            }
        }
        /*public static void getEmployeeByJobPosition(Employe[] e, String jp) {
            
        }
        /*public static void getEmployeeByHireDate(Employe[] e, Date d1, Date d2) {
            
        }
        /*public static void foreignEmployeeCount(Employe[] e) {
            
        }
        /*public static void getEmployeeBySalary(Employe[] e, double s1, double s2) {
            
        }*/
    }
}







// To populate Employee
/*System.out.println("Enter details");
            String name = sc.next();
            String jobP = sc.next();
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
