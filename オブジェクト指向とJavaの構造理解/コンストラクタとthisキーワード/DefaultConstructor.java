package オブジェクト指向とJavaの構造理解.コンストラクタとthisキーワード;

public class DefaultConstructor {
    String type;

    void display() {
        System.out.println("種類: " + type);
    }

    public static void main(String[] args) {
        DefaultConstructor f = new DefaultConstructor(); // コンストラクタ定義なしでも動作
        f.type = "リンゴ";
        f.display(); // 種類: リンゴ
    }
}
