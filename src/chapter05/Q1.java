package chapter05;

public class Q1 {
    public static void main(String[] args) {
        int n = 10;
        int ans = (n++) + (n++);
        System.out.println("n=" + n);
        System.out.println("ans=" + ans);
    }
}
