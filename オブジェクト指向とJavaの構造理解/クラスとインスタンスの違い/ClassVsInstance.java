package オブジェクト指向とJavaの構造理解.クラスとインスタンスの違い;

public class ClassVsInstance {
    public static void main(String[] args) {
        Dog a = new Dog();
        Dog b = new Dog();

        a.name = "タロウ";
        b.name = "ジロウ";

        a.bark(); // タロウがワンと鳴きました！
        b.bark(); // ジロウがワンと鳴きました！
    }
    
}

class Dog {
    String name;

    void bark() {
        System.out.println(name + "がワンと鳴きました！");
    }
}
