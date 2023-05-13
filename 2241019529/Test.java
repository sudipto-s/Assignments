import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[500];

	// Create an employee database 500 employees
        for (int i = 0; i < e.length; i++) {
            System.out.print("Enter "+(i+1)+"th employee details:\nName:");
            String name = sc.next();
            System.out.print("Enter job position: ");
            String jobP = sc.next();
            System.out.print("Enter contact number: ");
            String cNum = sc.next();
            System.out.print("Enter employee ID: ");
            int eId = sc.nextInt();
            System.out.print("Enter salary: ");
            double salry = sc.nextDouble();
            System.out.print("Enter address, street: ");
            String str = sc.next();
            System.out.print("Enter city: ");
            String ct = sc.next();
            System.out.print("Enter state: ");
            String st = sc.next();
            System.out.print("Enter country: ");
            String coun = sc.next();
            System.out.print("Enter pin code: ");
            int pin = sc.nextInt();
            System.out.print("Enter hire date, month & year: ");
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            e[i] = new Employee(name, jobP, eId, salry, cNum, str, ct, st, coun, pin, d, m, y);
        } sc.close();

	// Arrange the employee details in descending order by salary
        arrangeEmployeeBySalary(e);

	// Display the details of employees whose job position is manager
        getEmployeeByJobPosition(e, "Manager");

	// Display details of employees whose hire date is in between 01-04-2022 to 31-03-2023
       	getEmployeeByHireDate(e, new Date(1, 4, 2022), new Date(31, 3, 2023));

	// Display the number of foreign employee(s)
        foreignEmployeeCount(e);

	// Display the datails of employees whose salary is in range 150000 INR to 300000 INR
        getEmployeeBySalary(e, 150000, 300000);
    }
    public static void arrangeEmployeeBySalary(Employee[] e) {
        for (int i = 0; i < e.length; i++)
            for (int j = 0; j < e.length; j++)
                if(e[i].salary > e[j].salary) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
	for (Employee i : e)
            i.getDetails();
    }
    public static void getEmployeeByJobPosition(Employee[] e, String jp) {
        for (Employee i : e)
            if (i.jobPosition.equalsIgnoreCase(jp))
                i.getDetails();
    }
    public static void getEmployeeByHireDate(Employee[] e, Date d1, Date d2) {
        String d11 = ""+d1.year, d22 = ""+d2.year;
        if (d1.month < 10)
            d11 += "0"+d1.month;
        else
            d11 += d1.month;
        if (d1.day < 10)
            d11 += "0"+d1.day;
        else
            d11 += d1.day;
        if (d2.month < 10)
            d22 += "0"+d2.month;
        else
            d22 += d1.month;
        if (d2.day < 10)
            d22 += "0"+d2.day;
        else
            d22 += d1.day;
        for (Employee i : e) {
            int d = i.day, m = i.month, y = i.year;
            String a = ""+y;
            if (m < 10)
                a += "0"+m;
            else
                a += m;
            if (d < 10)
                a += "0"+d;
            else
                a += d;
            int vm = Integer.valueOf(a);
            int sD = Integer.valueOf(d11);
            int eD = Integer.valueOf(d22);
            if (vm >= sD && vm <= eD)
                i.getDetails();
        }
    }
    public static void foreignEmployeeCount(Employee[] e) {
        int c = 0;
        for (Employee i : e)
            if (!i.country.equalsIgnoreCase("INDIA"))
                c++;
        System.out.println("Number of Foreign employee(s): "+c);
    }
    public static void getEmployeeBySalary(Employee[] e, double s1, double s2) {
        for (Employee i : e)
            if (i.salary >= s1 && i.salary <= s2)
                i.getDetails();
    }
}
