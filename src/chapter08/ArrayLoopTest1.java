package chapter08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLoopTest1 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 4, 8, 16};
        System.out.println("---< 拡張for文 >---");
        for (int num: numbers) {
            System.out.print(num + "\t");
        }
        System.out.println();
        List<Integer> list = Arrays.asList(numbers);
        Collections.reverse(list);
        for (int n: list) {
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}
