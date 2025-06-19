package Java文法と基本構造の理解.クラスとmainメソッド構成;

public class InstanceCreate {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}

class Dog {
    public void bark() {
        System.out.println("ワン！");
    }
}