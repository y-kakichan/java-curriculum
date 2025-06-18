package Java文法と基本構造の理解.演算子;

public class LogicalOperators {
    public static void main(String[] args) {
        int score = 85;
        boolean isPassed = score >= 60 && score <= 100;
        System.out.println("合格判定: " + isPassed);
    }
}
