package オブジェクト指向とJavaの構造理解.ポリモーフィズム;

// （動的ディスパッチ）

class Animal {
    void run() {
        System.out.println("動物が走る");
    }
}

class Horse extends Animal {
    @Override
    void run() {
        System.out.println("馬が走る");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal a = new Horse();
        a.run(); // 馬が走る（実行時のクラスに応じて）
    }
}
