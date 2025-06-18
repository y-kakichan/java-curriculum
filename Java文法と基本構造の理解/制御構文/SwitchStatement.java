package Java文法と基本構造の理解.制御構文;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("月曜");
                break;
            case 2:
                System.out.println("火曜");
                break;
            default:
                System.out.println("その他");
        }
    }
}
