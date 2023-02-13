package chapter06;

public class Omikuji {
    public static void main(String[] args) {
        String[] omikuji = {"大吉", "小吉", "凶", "吉", "大凶"};
        /*
        System.out.println(omikuji[0]);
        System.out.println(omikuji[1]);
        System.out.println(omikuji[2]);
        System.out.println(omikuji[3]);
        System.out.println(omikuji[4]);
        */
        System.out.println(omikuji[(int)(Math.random() * 5)]);

    }
}
