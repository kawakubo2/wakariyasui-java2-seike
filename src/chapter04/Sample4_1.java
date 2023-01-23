package chapter04;

public class Sample4_1 {
    public static void main(String[] args) {
        int number; // 変数宣言
        number = 10; // 代入
        number = 20; // 代入
        number = number + 1; // 加算した後に代入。加算演算子(+)は代入演算子(=)よりも優先順位が高い
        System.out.println(number); // 参照(メモリから値を取り出す)
    }
}
