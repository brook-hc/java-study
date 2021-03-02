package aas_code_block;
    //相同点：静态代码块和静态属性、方法一样在创建类时，也就自动加载了。
    //不同点在于：静态代码块不仅加载，还会自动执行。
    //非静态代码块在创建对象的时候会自动执行。
public class A_code_block {
    public static void main(String[] args) {
        person.show();
        System.out.println(person.des);
        person p =new person(); //此时只是创建了一个对象，非静态代码块自动加载并运行了。
    }
}

class person{
    int age;
    static String des = "hahaha";


    public void eat(){
        System.out.println("drink tea~!");
    }
    public static void show(){
        System.out.println("I'm a person~!");
    }
    static {  //静态代码块的执行要早于静态方法的执行。
        System.out.println("aloha java");
        des = "welcome to java";
    }
    {
        System.out.println("hello java");
    }




}