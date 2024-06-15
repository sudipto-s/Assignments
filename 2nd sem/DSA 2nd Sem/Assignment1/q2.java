import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight(kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height(m): ");
        double h = sc.nextDouble();
        sc.close();
        double bmi = w/Math.pow(h, 2);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Normal Weight");
        else if (bmi >= 25 && bmi <= 29.9)
            System.out.println("Overweight");
        else if (bmi >= 30)
            System.out.println("Obese");
    }
}
