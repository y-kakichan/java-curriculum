package オブジェクト指向とJavaの構造理解.フィールドとメソッドの使い分け;

public class MethodExample {
    String name;
    int hp;

    void attack() {
        System.out.println(name + "は攻撃した！");
    }

    public static void main(String[] args) {
        MethodExample p = new MethodExample();
        p.name = "ボブ";
        p.hp = 100;
        p.attack(); // ボブは攻撃した！
    }
}
