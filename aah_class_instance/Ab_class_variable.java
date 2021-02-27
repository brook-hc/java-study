package aah_class_instance;

public class Ab_class_variable {
    public static void main(String[] args) {

    }
}

class Person {
    int age;
    String name;
    String language;

    //声明在方法内，方法的形参，代码块内，构造器形参，构造器内部变量，等都属于局部变量。
    //局部变量不能有权限修饰符，跟随方法的权限。
    public  void talk (String language) {       //函数形参属于局部变量,注意：形参一定要有数据类型，这里坑了我好久。
        System.out.println(name + "会说" + language);
    }

    public void eat() {
        String food = "卤粉";
        //函数内部的变量也是局部变量。
        //局部变量必须要赋值。全局变量有默认值，可以不赋值。
        System.out.println(name + "很喜欢吃" + food);
    }


}
