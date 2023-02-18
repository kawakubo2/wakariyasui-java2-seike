package chapter06;

import lib.Input;

public class Ex6_4_2 {
    public static void main(String[] args) {
        String productName = Input.getString("商品名");
        int unitPrice = Input.getInt("単価");
        System.out.println("商品名:" + productName);
        System.out.println("単　価:" + unitPrice);

    }
}
