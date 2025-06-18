package Java文法と基本構造の理解.制御構文;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("1回は実行される: i = " + i);
            i++;
        } while (i < 1);
    }
}