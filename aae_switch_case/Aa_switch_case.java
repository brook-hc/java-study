package aae_switch_case;

import java.util.Scanner;

public class Aa_switch_case {
    public static void main(String[] args) {
        Scanner num1 =new Scanner(System.in);

        System.out.print("请输入数字：");
        int num = num1.nextInt();

        switch (num){    //switch()里最好放int和string型，bool类型不支持。
            case 0:     //case不会判断范围，只会判断case的值与switch()里的值 == 的关系。
                System.out.println("zero");
                break;      //如果不加break，当找到一个入口进入执行代码后，不会直接退出，而是不加判断，把后面所有case里的代码都执行了。
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("输入非法");
        }
    }
}
