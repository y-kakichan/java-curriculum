package オブジェクト指向とJavaの構造理解.抽象クラスとインターフェース;

abstract class Animal {
    String name;
    public abstract void makeSound();
}

interface Movable {
    void move();
}

class Dog extends Animal implements Movable {
    public void makeSound() {
        System.out.println("ワン！");
    }

    public void move() {
        System.out.println("走る");
    }
}

public class AbstractVsInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // ワン！
        d.move();      // 走る
    }
}
