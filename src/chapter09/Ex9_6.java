package chapter09;

public class Ex9_6 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        System.out.println(a == 0 && ++b == 0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(a == 1 && ++b == 0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(c == 0 || ++b == 0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(c == 1 || ++b == 0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
