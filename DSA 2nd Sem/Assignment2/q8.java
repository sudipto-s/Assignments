interface DetailInfo {
    void display();
    int count();
}
class Person implements DetailInfo {
    static int maxcount;
    String name;
    Person(String name){
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
    }
    public int count() {
        return name.length();
    }
}
public class q8 {
    public static void main(String[] args) {
        Person p = new Person("Ansuman");
        p.display();
        System.out.println("Name length: " + p.count());
    }
}
