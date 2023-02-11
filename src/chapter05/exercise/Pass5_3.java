package chapter05.exercise;

public class Pass5_3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 34;
        System.out.println(a + "と" + b + "の合計は" + (a + b) + "です");
        System.out.printf("%dと%dの合計は%dです\n", a, b, a + b);

        String name = "山田";
        int age = 38;
        System.out.println(name + "さんの年齢は" + age + "歳です");
        System.out.printf("%sさんの年齢は%d歳です。\n", name, age);
    }
}
