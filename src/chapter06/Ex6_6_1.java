package chapter06;

public class Ex6_6_1 {
    public static void main(String[] args) {
        String str = "ダウンロード: Eclipse IDE for Java Developer";

        System.out.println("5番目の文字は " + str.charAt(5));
        System.out.println("Jは " + str.indexOf('J') + "番目");
        System.out.println("Kは " + str.indexOf('K') + "番目");
        System.out.println("長さ " + str.length());
        System.out.println(str.toUpperCase());
    }    
}
