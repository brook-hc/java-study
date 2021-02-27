package aak_inherit;

public class Son extends Father {
    int c = 6;
    //int a;
    //int b;
    // private int d;
    // private void show();
    //add();   子类可以继承父类的属性和方法，包括私有属性和方法。但不能直接调用私有属性和方法，间接调用还是可以的。
    public Son(int a, int b){
        this.a =a;
        this.b =b;
    }
    // java中父类可以有多个子类，但子类不能有多个父类。
    // java中可以多级继承，父-子-孙-重孙  重孙中有父，子，孙所有的属性和方法。
    // IDEAL中 ctrl+h 可以查看继承结构。
    // 所有类都直接或间接的继承Object类。

}
