package オブジェクト指向とJavaの構造理解.コンストラクタとthisキーワード;

public class ThisKeyword {
    String name;

    public ThisKeyword(String name) {
        this.name = name; // thisがないと混乱する
    }

    void greet() {
        System.out.println("こんにちは、" + name + "です。");
    }

    public static void main(String[] args) {
        ThisKeyword p = new ThisKeyword("ハナコ");
        p.greet(); // こんにちは、ハナコです。
    }
}
