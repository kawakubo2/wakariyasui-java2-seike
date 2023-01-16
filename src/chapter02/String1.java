package chapter02;

public class String1 {
    public static void main(String[] args) {
        String c2 = "a";
        System.out.println(c2.toUpperCase());
        System.out.println("ぼくは\tJavaを\n勉強している。");
        /*
         * \t, \r, \f " ", \00E9---> 空白文字
         */
        System.out.println("Caf\u00E9");
    }
}
