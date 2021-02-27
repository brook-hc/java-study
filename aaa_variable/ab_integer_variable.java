package aaa_variable;
//byte(1字节=8bit)，short（2字节），int（4字节），long（8字节）
public class ab_integer_variable {
    public static void main(String[] args) {
        //byte范围：-128-127
        byte id = 127;
        System.out.println(id);

        //long的定义末尾要加L
        long a = 34234234L;
        System.out.println(a);

        //int和short正常定义即可
        int b = 342;
        short c= 23423;
        System.out.println(b);
        System.out.println(c);


    }



}
