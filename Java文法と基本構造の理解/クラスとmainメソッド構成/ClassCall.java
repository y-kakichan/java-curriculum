package Java文法と基本構造の理解.クラスとmainメソッド構成;

public class ClassCall {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printHello();
    }
}

class Printer {
    public void printHello() {
        System.out.println("こんにちは！");
    }
}
