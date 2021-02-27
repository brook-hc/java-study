package aaa_variable;

public class ad_char_string_boolean {
    public static void main(String[] args) {
        //char(2字节)
        char a = 'b';
        //char c='ab'   char类型只能装一个字符，这样是错误的。
        char b = '中';
        //char d ='';   char不能为空,但String可以为空
        //System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        char c = '\n';    //char也可以存转义符
        System.out.print("hello" + c);
        System.out.println("world~!");

        //java的String的s要大写~！！！
        String i = "hello world~!";
        System.out.println(i);

        int num = 0203;
        String a1 = "我的学号是：";
        String b2 = a1 + num;       //只要有String类型，+号就是拼接
        System.out.println(b2);

        //练习：
        //一次性修改所有同名变量：shift + F6
        char ch='a';
        int nu = 20;
        String str="hello";
        System.out.println(ch+nu+str);  //char类型可以和数字进行运算，a=97，A=65.
        System.out.println(ch+str+nu);
        System.out.println(ch+(nu+str));  //String不能和数字进行运算。
        System.out.println((ch+nu)+str);
        System.out.println(str+ch+nu);

        System.out.println('*'+'\t'+'*');  //这打印出来居然是数字，因为字符+字符是加法运算，只有出现String才是拼接。

        //java的bool类型只能取true和false，而其他语言，0表示false，非0表示true。
        boolean b3 = true;
        System.out.println(b3);
    }
}
