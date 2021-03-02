package aat_final;

/*
final可以用来修饰：结构、类、方法、属性。
    1、final修饰一个类，那么该类不能被别的类所继承。比如：String，System类就是final，不能被继承。
    2、final修饰方法，该方法不能被重写。
    3、final修饰变量，那么该变量就变为了 “常量”。特别是当final作为形参赋值时，那么该形参只能被使用，不能被修改。

*/
public class A_final {
    final int a = 10;
    int b = 20;

    public final void add(int a) {
        //a+=1;  该语句报错，不能改变final修饰的属性。
        a += 1;
    }

    public void show(final int a) {
        System.out.println(a);
        //a += 1;  final修饰的形参，可以使用，但不能改变其值。
    }

    public static void main(String[] args) {
        A_final p = new A_final();
        p.show(5);
    }
}

class aa extends A_final {
    // public void add(){
    // }      重写add()方法，如果上面父类不加final，编译没问题，加了final就报错。故不能重写。
}


