package aal_override;

public class Son extends Father {
    int c=6;

    @Override   //这是重写的部分，如果建立son的类，son的add()方法会覆盖父类的add()
    public void add()
    {
        System.out.println(a+b+c);
    }
    public int show(int p){    // 老版本的java不能重写父类private的方法，但我是java11，好像可以。。。
        System.out.println(p);
        return p;             //  老版本的java重写方法的返回值要和父类的一样，但我是java11，我这返回的是int，好像也可以。。。
    }

    // 重写的话，如果父类是static，子类也要写static，如果不是static，子类也不用重写static。

}
