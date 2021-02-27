package aaj_constructor;
// 构造器的作用是为了创建对象并初始化对象。我们new A_constructor(); 类名后面加了括号，就是构造器。
// 因为我们写class的时候是没有括号的。

public  class A_constructor {
    int age;

    public A_constructor(int a){     // 构造函数不要写class啊，这里坑了我好久。
        age = a;
        System.out.println("有参构造函数~！");
    }
    public A_constructor(){
        System.out.println("无参构造函数~！");
    }
    public static void main(String[] args) {
        A_constructor p = new A_constructor(18);
        //这里new一个类，就是调用的构造器，如果我们不写，系统会默认给我们一个无参的构造器。
        //构造函数分为2种：无参的、有参的，如果这2种我们都自己定义，系统会根据有没有传形参来确定调用哪一个。
        // 一旦我们自己写了构造器，系统就会用我们的构造器，它默认的就不会用了。

    }



}


