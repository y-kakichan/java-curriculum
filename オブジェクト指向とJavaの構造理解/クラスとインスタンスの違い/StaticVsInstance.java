package オブジェクト指向とJavaの構造理解.クラスとインスタンスの違い;

public class StaticVsInstance {
    int instanceValue = 10;
    static int staticValue = 20;

    public static void main(String[] args) {
        StaticVsInstance s1 = new StaticVsInstance();
        StaticVsInstance s2 = new StaticVsInstance();

        s1.instanceValue = 30;
        s2.staticValue = 40;

        System.out.println(s1.instanceValue);         // 30
        System.out.println(s2.instanceValue);         // 10
        System.out.println(StaticVsInstance.staticValue); // 40
    }
}
