package オブジェクト指向とJavaの構造理解.ポリモーフィズム;

// （ポリモーフィズムの例）


class Animal {
    void speak() {
        System.out.println("動物が鳴く");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("ワンワン！");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("ニャー！");
    }
}

public class PolymorphismBasic {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.speak(); // ワンワン！
        a2.speak(); // ニャー！
    }
}
