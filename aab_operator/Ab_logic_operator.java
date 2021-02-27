package aab_operator;

public class Ab_logic_operator {
    public static void main(String[] args) {
        // &:与  &&：短路与  |：或  ||：短路或  != :非   ^:异或
        //下面主要讲&&和||
        int num = 10;
        boolean a = false;
        if (a & (num++ > 5)) {
            System.out.println("为真");
        } else {
            System.out.println("为假");
        }
        System.out.println(num);

        int num1 = 10;
        boolean a1 = false;
        if (a1 && (num1++ > 5)) {       //&&和&的意思是一样的，不同在于：当&&左边为假时，已经可以判定该表达式一定为假，故右边的代码不再执行。
            System.out.println("为真");  //所以这里num没有+1。
        } else {                        // ||的作用与&&一样，就不举例了~！
            System.out.println("为假");
        }
        System.out.println(num1);
    }
}
