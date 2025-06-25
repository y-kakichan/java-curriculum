package オブジェクト指向とJavaの構造理解.例外処理;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外です");
        } finally {
            System.out.println("finallyブロックは必ず実行されます");
        }
    }
}
