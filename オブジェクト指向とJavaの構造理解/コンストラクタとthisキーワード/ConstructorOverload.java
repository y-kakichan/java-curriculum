package オブジェクト指向とJavaの構造理解.コンストラクタとthisキーワード;

public class ConstructorOverload {
    String name;
    int hp;

    public ConstructorOverload() {
        this("名前なし", 100); // デフォルト
    }

    public ConstructorOverload(String name) {
        this(name, 100);
    }

    public ConstructorOverload(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + "のHPは" + hp);
    }

    public static void main(String[] args) {
        ConstructorOverload h1 = new ConstructorOverload();
        ConstructorOverload h2 = new ConstructorOverload("タロウ");
        ConstructorOverload h3 = new ConstructorOverload("ジロウ", 150);

        h1.showStatus(); // 名前なしのHPは100
        h2.showStatus(); // タロウのHPは100
        h3.showStatus(); // ジロウのHPは150
    }
}
