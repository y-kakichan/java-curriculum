package オブジェクト指向とJavaの構造理解.コンストラクタとthisキーワード;

public class ThisConstructorCall {
    String title;
    int price;

    public ThisConstructorCall() {
        this("タイトル未定", 0);
    }

    public ThisConstructorCall(String title) {
        this(title, 1000);
    }

    public ThisConstructorCall(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void show() {
        System.out.println(title + " - " + price + "円");
    }

    public static void main(String[] args) {
        ThisConstructorCall b1 = new ThisConstructorCall();
        ThisConstructorCall b2 = new ThisConstructorCall("Java入門");
        ThisConstructorCall b3 = new ThisConstructorCall("アルゴリズム", 2800);

        b1.show(); // タイトル未定 - 0円
        b2.show(); // Java入門 - 1000円
        b3.show(); // アルゴリズム - 2800円
    }
}
