package Java文法と基本構造の理解.メソッド;

public class MethodOverload {
    public static void main(String[] args) {
        show(10);
        show("文字列");
    }

    public static void show(int num) {
        System.out.println("数値: " + num);
    }

    public static void show(String text) {
        System.out.println("文字列: " + text);
    }
}
