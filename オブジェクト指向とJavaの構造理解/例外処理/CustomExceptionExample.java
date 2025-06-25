package オブジェクト指向とJavaの構造理解.例外処理;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("独自例外発生！");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
