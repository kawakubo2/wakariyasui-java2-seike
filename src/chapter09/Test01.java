package chapter09;

public class Test01 {
    public static void main(String[] args) {
        int a = 10;
        int b = a > 5 ? 100 : 1000;
        System.out.println("b = " + b);

        /*
        int c;
        if (a > 5) {
            c = 100;
        } else {
            c = 1000;
        }
        */
        int c = a > 15 ? 10000 : -10000;
        System.out.println("c = " + c);
    }
}
