package aaa_variable;

public class ae_typecast {
    public static void main(String[] args) {
        float a = 12.453f;
        int b = (int) a;
        System.out.println(b);

        //整数默认类型为int
        //小数默认类型为double
        byte c = 12;
        //float i = c + 1.5;  1.5默认为double类型，所以报错。
        //System.out.println(i);
    }
}
