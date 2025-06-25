package オブジェクト指向とJavaの構造理解.クラスとインスタンスの違い;

public class MultipleInstances {
    int count = 0;

    void increment() {
        count++;
        System.out.println("現在のカウント: " + count);
    }

    public static void main(String[] args) {
        MultipleInstances c1 = new MultipleInstances();
        MultipleInstances c2 = new MultipleInstances();

        c1.increment(); // 1
        c1.increment(); // 2
        c2.increment(); // 1 ← 別インスタンス
    }
}
