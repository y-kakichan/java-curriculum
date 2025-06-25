package オブジェクト指向とJavaの構造理解.例外処理;

public class ExceptionTypes {
    public static void main(String[] args) {
        int[] nums = new int[2];
        System.out.println(nums[10]); // 実行時エラー（非チェック）
    }
}