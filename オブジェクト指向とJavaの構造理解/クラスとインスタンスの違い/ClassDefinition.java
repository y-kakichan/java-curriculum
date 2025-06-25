package オブジェクト指向とJavaの構造理解.クラスとインスタンスの違い;


public class ClassDefinition {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "ポチ";
        myDog.bark();
    }
}

class Dog {
    String name;
    void bark() {
        System.out.println(name + "がワンと鳴きました！");
    }
    
}