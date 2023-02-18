package chapter06;

public class Sample6_6 {
    public static void main(String[] args) {
        String str1 = "Java".repeat(3);
        String str2 = "あっ！太郎さん、山田太郎さんですよね！".replace("太郎", "花子");
        String str3 = "abcdefghijk".substring(3, 6);
        String str4 = " Hello  ";
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3=" + str3);
        System.out.println("str4=" + str4 + "[" + str4.length() + "]");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int start = 0, step = 5, end = start + step;
        for (; start < alphabet.length(); start += step, end = start + step) {
            if (end >= alphabet.length()) { end = alphabet.length(); }
            System.out.println(alphabet.substring(start, end));
        }
    }
}
