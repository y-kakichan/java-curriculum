package オブジェクト指向とJavaの構造理解.フィールドとメソッドの使い分け;

public class FieldMethodRelation {
    String name;
    int hp;

    void heal(int amount) {
        hp += amount;
        System.out.println(name + "のHPが" + amount + "回復して、現在HPは" + hp);
    }

    public static void main(String[] args) {
        FieldMethodRelation p = new FieldMethodRelation();
        p.name = "キャロル";
        p.hp = 50;

        p.heal(20); // キャロルのHPが20回復して、現在HPは70
    }
}
