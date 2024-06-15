class Date {
    int day, month, year;
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
class Address extends Date {
    String street, city, state, country;
    int pin;
    Address(String street, String city, String state, String country, int pin, int d, int m, int y) {
        super(d, m, y);
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }
}
public class Employee extends Address {
    String name, jobPosition, contactNumber;
    int empId;
    double salary;
    Employee(String name, String jobPosition, int empId, double salary, String contactNumber, String str, String ct, String st, String co, int p, int d, int m, int y) {
        super(str, ct, st, co, p, d, m, y);
        this.name = name;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.empId = empId;
        this.salary = salary;
    }
    void getDetails() {
        System.out.println("Details: "+name+"\t"+jobPosition+"\t"+empId+"\t"+contactNumber+"\t"+salary);
        System.out.println("Address: "+street+" "+city+" "+state+" "+country+" "+pin);
        System.out.println("Hire date: "+day+"-"+month+"-"+year);
        System.out.println();
    }
}