package aah_class_instance;


public class Af_recursion {
    public static void main(String[] args) {
        Af_recursion p = new Af_recursion();

        double a = p.multi(5);  //阶乘
        System.out.println(a);

        int b = p.feibo(7);    //斐波那契数列
        System.out.println(b);
    }
    //求100的阶乘
    public double multi(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * multi(n-1);
        }
    }
    //斐波那契数列
    public int feibo(int m){
        if(m==1){
            return 1;
        }
        else if(m==2){
            return 1;
        }
        else {
            return feibo(m-1)+feibo(m-2);
        }
    }
}
