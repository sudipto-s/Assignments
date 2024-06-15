class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int Eid;
    double salary;
    Employee(String n, int a, int id, double s) {
        super(n, a);
        this.Eid = id;
        this.salary = s;
    }
    void display() {
        System.out.println(name+"\t"+Eid+"\t"+age+"\t"+salary);
    }
}
class q7 {
    public static void main(String[] args) {
        System.out.println("Name\t"+"Eid\t"+"Age\t"+"Salary");
        Employee e1 = new Employee("null", 0, 0, 0);
        Employee e2 = new Employee("abc", 10, 20, 30);
        e1.display();
        e2.display();
    }
}
