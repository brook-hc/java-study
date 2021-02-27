package aak_inherit;

public class Test {
    public static void main(String[] args) {
        Son p = new Son(5,6);
        int t=p.add();
        System.out.println(t);
        //System.out.println(d);  // d是父类的私有属性，子类依然可以继承到，但不能直接调用，也需要间接调用。
        p.show();  // 通过间接方法，可以显示d的值。

    }
}
