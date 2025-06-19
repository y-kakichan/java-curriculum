package Java文法と基本構造の理解.メソッド;

public class MethodReturn {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("合計: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
