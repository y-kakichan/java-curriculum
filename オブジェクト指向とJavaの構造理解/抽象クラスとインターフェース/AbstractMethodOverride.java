package オブジェクト指向とJavaの構造理解.抽象クラスとインターフェース;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ワン！");
    }
}

public class AbstractMethodOverride {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound(); // ワン！
    }
}