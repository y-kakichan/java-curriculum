package オブジェクト指向とJavaの構造理解.例外処理;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0で割ろうとしました");
        }
    }
}