
class Date {
    int day, month, year;
    Date(int day, int month, int year) {
        this.day = day;
        this.month =month;
        this.year = year;
    }
}
class Address extends Date {
    String address, country;
    int pin;
    Address(String address, String country, int pin, int d, int m, int y) {
        super(d, m, y);
        this.address = address;
        this.country = country;
        this.pin = pin;
    }
}
public class Employee extends Address {
    String name, jobPosition, contactNumeber;
    int empId;
    double salary;
    Employee(String name, String jobPosition, int empId, double salary, String contactNumber, String addr, String co, int p, int d, int m, int y) {
        super(addr, co, p, d, m, y);
        this.name = name;
        this.jobPosition = jobPosition;
        this.contactNumeber = contactNumber;
        this.empId = empId;
        this.salary = salary;
    }
    void getDetails() {
        System.out.println("Details: "+name+"\t"+jobPosition+"\t"+empId+"\t"+contactNumeber+"\t"+salary);
        System.out.println("Address: "+address+", "+country+" "+pin);
        System.out.println("Hire date: "+day+"-"+month+"-"+year);
        System.out.println();
    }
}
