package chapter06;

public class Sample6_99 {
    public static void main(String[] args) {
        String email = "tomo.kawakubo@gmail.com"; // ローカル部@ドメイン部
        int pos = email.indexOf('@');
        System.out.println("ローカル部: " + email.substring(0, pos));
        System.out.println("ドメイン部: " + email.substring(pos + 1));
        String[] a = email.split("@");
        System.out.println("ローカル部: " + a[0]);
        System.out.println("ドメイン部: " + a[1]);
    }
}
