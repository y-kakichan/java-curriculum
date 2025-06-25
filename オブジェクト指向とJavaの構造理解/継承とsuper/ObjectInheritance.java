package オブジェクト指向とJavaの構造理解.継承とsuper;

public class ObjectInheritance {
    String name;

    public ObjectInheritance(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ヒーロー: " + name;
    }

    public static void main(String[] args) {
        ObjectInheritance hero = new ObjectInheritance("マサル");
        System.out.println(hero); // toString() が呼ばれる
    }
}
