package aap_wrapper;

// wrapper的思想就是把基本数据类型：int float double等，包装成一个类，让他们也能传入某些函数，也可以让他们自己做些操作如：toString等
public class A_convert_wrapper_basicType {

        public static void main(String[] args) {

                int a = 10;
//              System.out.println(a.toString());   a是基本数据类型，不能调用方法。
                Integer num = new Integer(a);  //警告显示：deprecated，遭到抨击的，批评的~！看来这语句不提倡用。
                System.out.println(num.toString());
                int b = num.intValue();       //把包装类转换为基本数据类型。
                System.out.println(b+1);

                //把基本数据类型转化为String
                float c =4.45f;
                String i = String.valueOf(c);
                System.out.println(i);

                //把String转换基本数据类型
                String str = "1234";
                //int num1 = (int)str;  强转不行
                int m = Integer.parseInt(str);
                System.out.println(m);

                //Integer在生成的时候自动会加载一个数组，里面存了-128~127的整数，因为发现这些数人们用的比较频繁，
                //自动加载到缓存运行快，不用去new了，new了还要清理垃圾，消耗系统资源，拖慢速度。
                Integer ab = 1; // 自动装包
                Integer ba = 1;
                System.out.println(ab == ba);
                Integer bc = 128;
                Integer cb = 128;
                System.out.println(bc == cb);


        }
}
