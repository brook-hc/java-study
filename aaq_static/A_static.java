package aaq_static;

public class A_static {
    static int a = 0;
    int b ;

    //静态方法不依赖对象而存在，在加载类的时候就同时加载了静态属性和变量，它们的数据不是放在堆区中，而是放在方法区的静态域中。
    //所有的对象都可以修改静态属性，都可以调用静态方法，即所有对象共享静态的属性和方法。
    //静态属性和方法不随对象的消亡而消亡，只有类消亡了，静态属性和方法才会消亡。
    //一般为所有对象所共有的性质，可以设置为静态属性，如：银行的利率等。
    public A_static(){
        a+=1;   //查看共创建了多少对象。
    }
    public  A_static(int b){
        this();     // 这句话是调用上面的无参构造。
        this.b = b;
    }
    //静态方法里不能有this，super()关键字。
    public static void add() {
        a += 1;     //静态方法只能调用静态属性。
//        b += 1;    静态方法不能调用非静态属性
//        show();   静态方法不能调用非静态方法。
    }

    public void show() {
        a += 1; //非静态方法可以调用静态属性。
        b += 1;
        add();  //非静态方法可调用静态方法。
    }
    public static void display(){
        System.out.println("aloha java~！");
    }

    public static void main(String[] args) {
        A_static p1 = new A_static(5);
        A_static p2 = new A_static(8);
        System.out.println(A_static.a);
        A_static.display();     //静态方法和属性，直接用类名就可以调出来。
                                //从而一些工具类里面的一些方法都是静态的，如：Math，Arrays这样的工具直接用类名就可以调用来。
                                //否则就要new一个对象再调用，多此一举了。
    }


}
