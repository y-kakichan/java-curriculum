package オブジェクト指向とJavaの構造理解.パッケージとimport;


import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        double r = sqrt(16); // Math.sqrt と書かなくてOK
        System.out.println("平方根: " + r);
    }
}
