package Java文法と基本構造の理解.変数とデータ型;

public class IntLongVarSample {
    public static void main(String[] args) {
        int num1 = 100;
        long num2 = 10000000000L;
        var num3 = 50; // varは型推論

        System.out.println("int: " + num1);
        System.out.println("long: " + num2);
        System.out.println("var: " + num3);
    }
}