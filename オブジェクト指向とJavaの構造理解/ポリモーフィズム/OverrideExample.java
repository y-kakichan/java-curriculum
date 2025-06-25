package オブジェクト指向とJavaの構造理解.ポリモーフィズム;

class Parent {
    void greet() {
        System.out.println("こんにちは！");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("やっほー！");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet(); // やっほー！
    }
}