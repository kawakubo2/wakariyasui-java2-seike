package chapter06;

public class MyRandom {
    public static void main(String[] args) {
        // 0から10までの乱数を生成
        System.out.println((int)(Math.random() * 101));
        // 切上げ
        double x = 1.00000001;
        System.out.println(Math.ceil(x));
        double y = 1.99999999;
        System.out.println(Math.floor(y));
        double z = 1.5678;
        System.out.println(Math.round(z));

        double d1 = 1.23456;
        d1 = Math.round(d1 * 1000) / 1000.0;
        System.out.println(d1);

        System.out.println(myRound(d1, 3));
    }
    public static double myRound(double num, int prec) {
        return Math.round(num * Math.pow(10, prec)) / Math.pow(10, prec);
    }
}
