package aad_if_else;

import java.util.Scanner;

public class Aa_if_else {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = num.nextInt();

        if(age<0){
            System.out.println("年龄非法~！");
        }
        else if (age<18){
            System.out.println("你好，小鲜肉~！");
        }
        else if (age<40){
            System.out.println("你好，年轻人~！");
        }
        else{
            System.out.println("你好，大叔~！");
        }
    }
}
