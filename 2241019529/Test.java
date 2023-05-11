import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[2];
        for (int i = 0; i < e.length; i++) {
            System.out.println("Enter details");
            String name = sc.next();
            String jobP = sc.next();
            String cNum = sc.next();
            int eId = sc.nextInt();
            double salry = sc.nextDouble();
            String addr = sc.next();
            String coun = sc.next();
            int pin = sc.nextInt();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            e[i] = new Employee(name, jobP, eId, salry, cNum, addr, coun, pin, d, m, y);
            //e[i] = new Employee("Sudipta", "manager", 1258, 59000*(i+1), "921234567890", "ITER, Bhubaneshwar", "India", 851030, 2, 2, 2016);
        } sc.close();
        // arrangeEmployeeBySalary(e);
        // getEmployeeByJobPosition(e, "Manager");
        // getEmployeeByHireDate(e, new Date(5, 5, 2015), new Date(10, 8, 2016));
        // foreignEmployeeCount(e);
        // getEmployeeBySalary(e, 40000, 65000);
        /*for (int i = 0; i < e.length; i++)
            e[i].getDetails(); */
    }
    public static void arrangeEmployeeBySalary(Employee[] e) {
        for (int i = 0; i < e.length; i++)
            for (int j = 0; j < e.length; j++)
                if(e[i].salary > e[j].salary) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
    }
    public static void getEmployeeByJobPosition(Employee[] e, String jp) {
        for (int i = 0; i < e.length; i++)
            if (e[i].jobPosition.equals(jp.toLowerCase()))
                e[i].getDetails();
    }
    public static void getEmployeeByHireDate(Employee[] e, Date d1, Date d2) { //to be updated
        for (int i = 0; i < e.length; i++) {
            int d = e[i].day, m = e[i].month, y = e[i].year;
            if ((y >= d1.year && y <= d2.year) && (m >= d1.month && m <= d2.month) && (d >= d1.day && d <= d2.day))
                e[i].getDetails();
        }
    }
    public static void foreignEmployeeCount(Employee[] e) {
        int c = 0;
        for (int i = 0; i < e.length; i++)
            if (e[i].contactNumber.substring(0, 2).equals("91"))
                c += 0;
            else
                c++;
        System.out.println("Number of Foreign employee(s): "+c);
    }
    public static void getEmployeeBySalary(Employee[] e, double s1, double s2) {
        for (int i = 0; i < e.length; i++)
            if (e[i].salary >= s1 && e[i].salary <= s2)
                e[i].getDetails();
    }
}







// To populate Employee
/*System.out.println("Enter details");
            String name = sc.next();
            String jobP = sc.next().toLowerCase();
            String cNum = sc.next();
            int eId = sc.nextInt();
            double salry = sc.nextDouble();
            String addr = sc.next()
            String coun = sc.next();
            int pin = sc.nextInt();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            e[i] = new Employe(name, jobP, eId, salry, cNum, addr, coun, pin, d, m, y); */
