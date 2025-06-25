package オブジェクト指向とJavaの構造理解.抽象クラスとインターフェース;

abstract class Animal {
    public void breathe() {
        System.out.println("呼吸している");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal a = new Dog(); // 下で定義する Dog を使用
        a.breathe();
    }
}

class Dog extends Animal {
    // 抽象メソッドがないので override は不要
}
