package chapter06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lib.Input;

public class Sample6_4 {
    public static void main(String[] args) {
        String name = Input.getString("名前");
        System.out.println("こんにちは、" + name + "さん");
        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Y年M月d日");
        System.out.println(today.format(fmt));
    }
}
