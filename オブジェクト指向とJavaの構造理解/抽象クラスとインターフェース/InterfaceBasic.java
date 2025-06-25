package オブジェクト指向とJavaの構造理解.抽象クラスとインターフェース;

interface Greeter {
    void greet();
}

class JapaneseGreeter implements Greeter {
    public void greet() {
        System.out.println("こんにちは");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        Greeter g = new JapaneseGreeter();
        g.greet(); // こんにちは
    }
}