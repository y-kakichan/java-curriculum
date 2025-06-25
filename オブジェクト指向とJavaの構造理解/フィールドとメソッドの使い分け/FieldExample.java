package オブジェクト指向とJavaの構造理解.フィールドとメソッドの使い分け;

public class FieldExample {
    String name;
    int hp;

    public static void main(String[] args) {
        FieldExample p = new FieldExample();
        p.name = "アリス";
        p.hp = 100;
        System.out.println(p.name + "のHPは " + p.hp);
    }
}

