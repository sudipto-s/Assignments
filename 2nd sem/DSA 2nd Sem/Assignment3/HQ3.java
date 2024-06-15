package DSA_2nd_Sem.Assignment3;

public class HQ3 {
    static boolean isPalin(String a, int s, int e) {
        if (s == e)
            return true;
        if (a.charAt(s) != a.charAt(e))
            return false;
        if (s < e+1)
            return isPalin(a, s + 1, e - 1);
        return true;
    }
    public static void main(String[] args) {
        String a = "absfba";
        System.out.println(isPalin(a, 0, a.length()-1));
    }
}
