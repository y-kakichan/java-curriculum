package オブジェクト指向とJavaの構造理解.コンストラクタとthisキーワード;

public class ConstructorBasic {
    String name;

    public ConstructorBasic(String n) {
        name = n;
    }

    void introduce() {
        System.out.println("こんにちは、" + name + "です。");
    }

    public static void main(String[] args) {
        ConstructorBasic a = new ConstructorBasic("ネコ");
        a.introduce(); // こんにちは、ネコです。
    }
}
