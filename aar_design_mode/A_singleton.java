package aar_design_mode;

// singleton表示单例设计模式
// 单例设计模式要求一个类只允许创建一个对象。比如：windows的任务管理器和回收站都是单例模式，一个系统不可能有2个任务管理器和回收站。
public class A_singleton {
    public static void main(String[] args) {
        Bank p1 = Bank.getInstance();
        Bank p2 = Bank.getInstance();
        System.out.println(p1 == p2);  //返回true，表明他们指向同一个对象。

        Order q1 =  Order.getInstance();
        Order q2 =  Order.getInstance();
        System.out.println(q1 == q2);
    }
}
// 饿汉式单例模式：
class Bank {
    private Bank() {
    }
    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}

// 懒汉式单例模式：
class Order{
    private Order(){
    }
    private static Order instance = null; //懒汉式开始不创建对象，当第一次调用时才在内存创建对象。
    public static Order getInstance(){    //好处是：不用一开始就加载内存创建对象，
        if(instance == null){             //坏处是：线程不安全。
            instance = new Order();
        }
        return instance;
    }
}