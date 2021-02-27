package aah_this;
// this表示当前类。它可以修饰属性和方法。
public class A_this {
    int age;
    String name;

//    public void aaa(int age){    //当形参和属性名字相同了，该方法的赋值操作就会出现歧义。
//        age = age;          //编译器会认为：age = age 这条语句是形参赋值给形参。
//    }
// 正确的写法如下：
    public  void aaa(int age){
        this.age = age;    // 表示把形参age的值赋给类属性age。
    }
    public static void main(String[] args) {
        A_this p = new A_this(666);
        p.aaa(18);
        System.out.println(p.age);


    }
    // 构造器可以被构造器调用。
    public A_this(){    //无参构造
        System.out.println("无参构造~！！！");
    }
    public A_this(int a){    //有参构造
        this();     // 调构造器的这条语句必须放在首行。
        System.out.println("有参构造："+a);
        show();    // 构造器可以调用普通方法。
    }
    public void show(){
        //this();   但普通方法无法调用构造器。
        System.out.println("方法也可以调用构造器~！！！");
    }
}
