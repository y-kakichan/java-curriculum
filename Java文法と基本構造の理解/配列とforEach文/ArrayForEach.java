package Java文法と基本構造の理解.配列とforEach文;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] scores = { 85, 90, 75 };
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
