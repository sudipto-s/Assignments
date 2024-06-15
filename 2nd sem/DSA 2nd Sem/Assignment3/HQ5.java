package DSA_2nd_Sem.Assignment3;

public class HQ5 {
    static void towerOfHanoi(int n, char fRod,char lRod, char mRod) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, fRod, mRod, lRod);
        System.out.println("Move disk " + n + " from rod "+ fRod + " to rod "+ lRod);
        towerOfHanoi(n - 1, mRod, lRod, fRod);
    }
    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, 'A', 'C','B');
    }
}
