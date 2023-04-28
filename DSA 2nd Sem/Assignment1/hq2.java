import java.util.*;
public class hq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of strings? ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < str.length; i++)
            str[i] = sc.next();
        
        sc.close();

        for (int i = str.length - 1; i >= 0; i--)
            System.out.println(str[i]);
    }
}
