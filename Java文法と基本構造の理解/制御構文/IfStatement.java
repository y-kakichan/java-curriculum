package Java文法と基本構造の理解.制御構文;

public class IfStatement {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 80) {
            System.out.println("優");
        } else if (score >= 60) {
            System.out.println("良");
        } else {
            System.out.println("不可");
        }
    }
}
