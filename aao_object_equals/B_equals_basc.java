package aao_object_equals;

public class B_equals_basc {
    //先来看==运算符的用法：
    //1、如果是基本数据类型，比较的是二者的值是否相等。
    //2、如果是引用数据类型，比较的是二者的地址是否相同。

    //equals()方法：
    //1、是一个方法，不是运算符。
    //2、只能用于引用数据类型~！！！
    //3、object中定义的equals()和==运算符的作用是相同的。
    //4、像String、Date、file、包装类等都重写了object中的equals()方法，他们就不是用==做比较了，而是比较他们的内容是否相同。
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        double c = 8.0;
        System.out.println(a == b);
        System.out.println(a == c);     // 死记吧，int会自动类型提升为double。

        boolean i = true;
      //  System.out.println(a==i);   java里boolean只能是true和false，c语言里，0是false，非0都是true。
        char d = 8;
        char e = '8';
        System.out.println(d==a);     // char d = 8; d就是数字8，。
        System.out.println(e==a);    //char e = '8'; 而‘8’不是数字8，它的值为对应的asc码。

        Person p1 = new Person(10,"hello");
        Person p2 = new Person(10,"hello");
        System.out.println(p1 == p2);  //结果是false


    }

}
