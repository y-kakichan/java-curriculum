package オブジェクト指向とJavaの構造理解.継承とsuper;

// Person.java
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

// SuperConstructorCall.java
public class SuperConstructorCall extends Person {
    int grade;

    public SuperConstructorCall(String name, int grade) {
        super(name); // 親のコンストラクタ呼び出し
        this.grade = grade;
    }

    public void showInfo() {
        System.out.println("名前: " + name + ", 学年: " + grade);
    }

    public static void main(String[] args) {
        SuperConstructorCall student = new SuperConstructorCall("山田", 2);
        student.showInfo(); // 名前: 山田, 学年: 2
    }
}
