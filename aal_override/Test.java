package aal_override;

public class Test {
    public static void main(String[] args) {

        Son i = new Son(); //子类的对象一定要创建，要不然程序跑不了
        i.add();  // 由于重写了add()，只会执行son里的add()
        int q= i.show(7); // 可能我是java11，能重写父类的private方法，但视频中讲不行。。。
        System.out.println(q); // 老版本的java重写方法的返回值要和父类的一样，但我是java11，我这返回的是int，好像也可以。。。



        //Father k = i;
        //k.add();           //这是多态的部分，把子类赋给父类，也可以理解为父类实际指向的是一个子类，所以
        // 调用add函数时是加载的子类的add。
    }
}
