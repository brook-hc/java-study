package aac_scanner;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  //在堆区开辟一块空间存放输入内容，命名为scan（名字可以随便取）

        System.out.println("请输入您的名字：");
        String name = scan.next();      //scan.next()表示上面开辟的内存空间scan，可以接受字符串。
        System.out.println("您的名字是："+name);

        System.out.println("请输入您的年龄：");
        int age = scan.nextInt();       //scan.nextInt()表示接受整型变量。
        System.out.println("您的年龄是："+age);

    }
}
