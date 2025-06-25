package オブジェクト指向とJavaの構造理解.例外処理;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}
