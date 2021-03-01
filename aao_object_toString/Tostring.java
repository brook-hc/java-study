package aao_object_toString;

//String、Date、file、包装类都重写了toString()
public class Tostring {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        System.out.println(a.toString());   //数组未重写，故输出地址
        System.out.println(a[1]);

        customer q = new customer();    //自定义的类，但未重写，故输出地址
        System.out.println(q.toString());

        person p = new person(18,"paul");   //重写了类，
        System.out.println(p.toString());

    }
}

class person{
    int age;
    String name;
    public person(int a, String b){
        this.age=a;
        this.name=b;
    }
    public String toString(){
        return "person[name = "+name+" age = "+age+"]";
    }
}

class customer{
    int age;

}