package Java文法と基本構造の理解.アクセス修飾子;

public class PrivateExample {
    private int age = 20;

    private void showAge() {
        System.out.println("年齢: " + age);
    }

    public void callShowAge() {
        showAge(); // 同一クラス内からアクセス可
    }
}
