package オブジェクト指向とJavaの構造理解.ポリモーフィズム;

// （staticはオーバーライドされない）

class Parent {
    static void hello() {
        System.out.println("親のhello");
    }
}

class Child extends Parent {
    static void hello() {
        System.out.println("子のhello");
    }
}

public class StaticVsOverride {
    public static void main(String[] args) {
        Parent p = new Child();
        p.hello(); // 親のhello（staticメソッドはクラスで決まる）
    }
}
