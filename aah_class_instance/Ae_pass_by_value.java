package aah_class_instance;

//java的值传递就分2种：1，基本数据类型传递。2，引用数据类型传递。
public class Ae_pass_by_value {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Ae_pass_by_value p = new Ae_pass_by_value();
//      p.swap(a,b);     //java这样传值是不能修改的。
        int[] c = new int[2];
        c[0]=10;
        c[1]=20;
        p.swap(c,0,1);    //数组是引用类型，传值的时候是传地址，故交换的是真实数组的值。


        System.out.println(c[0] + "\t" + c[1]);
    }

//    public void swap(int a, int b) {   // c++可以传&a，&b解决，但java要用数组或class来解决。
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//    }

    public void swap(int[] a,int b,int c) {     //java太麻烦了。。。
        int temp;
        temp = a[b];
        a[b] = a[c];
        a[c] =  temp;

    }


}
