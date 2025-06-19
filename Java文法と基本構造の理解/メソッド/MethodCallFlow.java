package Java文法と基本構造の理解.メソッド;

public class MethodCallFlow {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("処理開始");
        step1();
    }

    public static void step1() {
        System.out.println("ステップ1実行");
    }
}