package aan_polymorphism;

public class Son extends Father{
    int age;
    int num;
    public void eat(){
        System.out.println("儿子吃东西");
    }
    public void show(int a){
        System.out.println("儿子的钱："+a);
    }
    public void exercise(){
        System.out.println("碰碰跳跳搞锻炼~！");
    }

    //1、多态就是用父类的引用(指针)指向子类的对象。
    //2、多态的实现必须有继承关系，没有继承关系就不存在多态。
    //3、多态关系中，只能调父类中有的方法（包括子类重写和没有重写的），如果一个方法父类没有，只有子类有，那么就调不了。
    //4、多态中，编译时，只能调用父类的方法，但执行时实际运行的是子类重写的方法。简言之：编译在左，执行在右。
    public static void main(String[] args) {
        Father p = new Son();  //这就是用父类的引用(指针)指向子类的对象
        p.eat();        // ctrl点eat()方法，会跳到父类的eat()方法，但执行的是子类的代码，因为重写之后，编译在左，执行在右。
        p.show(668);
        //p.exercise();     // 该方法父类中没有，所以调不了。。。
        p.dance();      // 该方法父类中有，子类没有重写，也可以调。
    }
}
