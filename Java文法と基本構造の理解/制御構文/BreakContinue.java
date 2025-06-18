package Java文法と基本構造の理解.制御構文;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.println("i = " + i);
        }
    }
}
