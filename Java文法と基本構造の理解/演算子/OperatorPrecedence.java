package Java文法と基本構造の理解.演算子;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 3 + 2 * 4;
        int result2 = (3 + 2) * 4;
        System.out.println("3 + 2 * 4 = " + result1);
        System.out.println("(3 + 2) * 4 = " + result2);
    }
}
