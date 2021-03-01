package aap_wrapper;

public class B_auto_packing_unpacking {
    public static void main(String[] args) {
        int a=10;
        B_auto_packing_unpacking b = new B_auto_packing_unpacking();
        b.method(a);  //int a 能传入method函数是因为，系统自动做了装包和拆包的动作。且是作为多态传进Object的。
    }

    public void method(Object a){
        System.out.println("hello");
    }
}



