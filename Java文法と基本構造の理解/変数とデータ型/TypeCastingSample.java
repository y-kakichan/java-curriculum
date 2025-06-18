package Java文法と基本構造の理解.変数とデータ型;

public class TypeCastingSample {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // 自動変換
        System.out.println("double: " + d);

        double x = 9.9;
        int y = (int)x; // キャスト
        System.out.println("int: " + y);
    }
}
