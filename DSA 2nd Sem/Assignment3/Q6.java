class Box<T> {
    T t;
    Box(T t) {
        this.t = t;
    }
    void set(T t) {
        this.t = t;
    }
    T get() {
        return t;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Box<String> s1 = new Box<>("It is the object of box string");
        Box<String> s2 = s1;
        System.out.println(s1.get());
        System.out.println(s2.get());
        s1.set("world");
        System.out.println(s1.get());
        System.out.println(s2.get());

        Box<Integer> s3 = new Box<>(10);
        Box<Integer> s4 = s3;
        System.out.println(s3.get());
        System.out.println(s4.get());
        s3.set(5);
        System.out.println(s3.get());
        System.out.println(s4.get());

        Box<Object> s5 = new Box<>(new Object());
        Box<Object> s6 = s5;
        System.out.println(s5.get());
        System.out.println(s6.get());
        s5.set("new");
        System.out.println(s5.get());
        System.out.println(s6.get());
        s5.set(6);
        System.out.println(s5.get());
        System.out.println(s6.get());
    }
}
