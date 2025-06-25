package オブジェクト指向とJavaの構造理解.継承とsuper;

public class InheritanceBasic extends Animal {
    void bark() {
        System.out.println("ワン！");
    }

    public static void main(String[] args) {
        InheritanceBasic dog = new InheritanceBasic();
        dog.eat();  // 親クラスのメソッド
        dog.bark(); // 自クラスのメソッド
    }
}

class Animal {
    void eat() {
        System.out.println("食べています");
    }
}