package オブジェクト指向とJavaの構造理解.抽象クラスとインターフェース;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("印刷しています");
    }

    public void scan() {
        System.out.println("スキャンしています");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print(); // 印刷しています
        mfp.scan();  // スキャンしています
    }
}
