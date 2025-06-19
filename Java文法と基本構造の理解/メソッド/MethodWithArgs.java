package Java文法と基本構造の理解.メソッド;

public class MethodWithArgs {
    public static void main(String[] args) {
        greet("山田");
    }

    public static void greet(String name) {
        System.out.println(name + "さん、こんにちは！");
    }
}
