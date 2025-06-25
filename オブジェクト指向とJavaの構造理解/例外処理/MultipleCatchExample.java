package オブジェクト指向とJavaの構造理解.例外処理;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException発生");
        } catch (Exception e) {
            System.out.println("他の例外が発生");
        }
    }
}