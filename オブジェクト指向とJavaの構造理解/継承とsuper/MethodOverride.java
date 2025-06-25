package オブジェクト指向とJavaの構造理解.継承とsuper;

// Animal.java
class Animal {
    void speak() {
        System.out.println("何かが鳴いている");
    }
}

// MethodOverride.java
public class MethodOverride extends Animal {
    @Override
    void speak() {
        System.out.println("ニャー");
    }

    public static void main(String[] args) {
        MethodOverride cat = new MethodOverride();
        cat.speak(); // ニャー
    }
}
