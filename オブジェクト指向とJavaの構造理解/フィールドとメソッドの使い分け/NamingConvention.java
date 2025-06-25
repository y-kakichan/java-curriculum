package オブジェクト指向とJavaの構造理解.フィールドとメソッドの使い分け;

public class NamingConvention {
    private int speed;

    public void accelerate() {
        speed += 10;
        System.out.println("速度: " + speed + "km/h に加速しました。");
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        NamingConvention car = new NamingConvention();
        car.accelerate(); // 速度: 10km/h に加速しました。
        System.out.println("現在の速度: " + car.getSpeed() + "km/h");
    }
}
