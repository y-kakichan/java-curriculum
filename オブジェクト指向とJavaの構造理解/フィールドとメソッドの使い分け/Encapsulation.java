package オブジェクト指向とJavaの構造理解.フィールドとメソッドの使い分け;

public class Encapsulation {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        Encapsulation account = new Encapsulation();
        account.deposit(1000);
        System.out.println("現在の残高: " + account.getBalance() + "円");
    }
}
