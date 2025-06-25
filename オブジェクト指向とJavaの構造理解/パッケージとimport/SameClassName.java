package オブジェクト指向とJavaの構造理解.パッケージとimport;


import java.sql.Date;

public class SameClassName {
    public static void main(String[] args) {
        Date d = new Date(System.currentTimeMillis());
        System.out.println("現在日時: " + d);
    }
}