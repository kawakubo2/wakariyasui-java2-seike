package chapter09;

import lib.Input;

public class 文字は数値に過ぎない {
    public static void main(String[] args) {
        String name = Input.getString("名前");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + " の文字コードは " + name.codePointAt(i));
        }
    }
}
