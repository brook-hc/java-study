package aah_class_instance;
//创建对象，没有显示的把这个对象赋给一个变量，即为匿名对象。
//匿名对象，只能使用一次。
public class Ac_anonymous_instance {
    public static void main(String[] args) {
        new animal().weight=500;
        new animal().eat();  //显然这里没有把上面的500打印出来。

    }
}

class animal{
    int weight;
    String name="熊出没";

    public void eat(){
        System.out.println(name+"在吃东西，体重已经"+weight+"斤重了~！");
    }
}
