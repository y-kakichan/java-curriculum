package Java文法と基本構造の理解.配列とforEach文;

public class ArrayForLoop {
    public static void main(String[] args) {
        int[] scores = { 60, 70, 80 };
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}
