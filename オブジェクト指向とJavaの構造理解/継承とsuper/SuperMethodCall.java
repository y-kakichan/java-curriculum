package オブジェクト指向とJavaの構造理解.継承とsuper;

// Animal.java
class Animal {
    void speak() {
        System.out.println("動物が鳴いている");
    }
}

// SuperMethodCall.java
public class SuperMethodCall extends Animal {
    @Override
    void speak() {
        super.speak(); // 親のspeakも呼び出し
        System.out.println("ワンワン！");
    }

    public static void main(String[] args) {
        SuperMethodCall dog = new SuperMethodCall();
        dog.speak(); // 動物が鳴いている → ワンワン！
    }
}
