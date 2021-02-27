package aaf_for_while_circular;

public class Aa_for_circular {
    public static void main(String[] args) {
        int num=1;
        for(System.out.println("a");num<=3; System.out.print("b"),num++ ){
            System.out.print("c");
        }       //这里for的第三个参数放进了2个参数，语法没问题。
    }
}
