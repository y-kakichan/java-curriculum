package Java文法と基本構造の理解.アクセス修飾子;

class Parent {
    protected void show() {
        System.out.println("親クラスのprotectedメソッド");
    }
}

class Child extends Parent {
    public void callShow() {
        show(); // 継承関係にあるためアクセス可
    }
}
