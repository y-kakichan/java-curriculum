package オブジェクト指向とJavaの構造理解.ポリモーフィズム;

class Animal {}

class Dog extends Animal {
    void bark() {
        System.out.println("ワン！");
    }
}

public class InstofExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        if (a instanceof Dog) {
            ((Dog) a).bark(); // 安全にキャストしてbark()を使う
        }
    }
}
