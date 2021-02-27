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
    //4、 Father p1 = new Son(); Son s = (Son) p1; 把多态p1强转成子类对象，这时它就可以调用父类没有的子类方法了。
    //4、多态中，编译时，只会调用父类的方法，但执行时实际运行的是子类重写的方法。简言之：编译在左，执行在右。
    //5、编译在左，执行在右。这只适用于方法~！！！如果是属性，还是会执行父类的。再一次强调，当名字相同时，属性不会覆盖，方法会覆盖。
    public static void main(String[] args) {
        Father p = new Son();  //这就是用父类的引用(指针)指向子类的对象
        p.eat();        // ctrl点eat()方法，会跳到父类的eat()方法，但执行的是子类的代码，因为重写之后，编译在左，执行在右。
        p.show(668);
        //p.exercise();     // 该方法父类中没有，所以调不了。。。
        p.dance();      // 该方法父类中有，子类没有重写，也可以调。

        //以下是多态中，怎么调用父类没有的，而子类有的方法。
        Father p1 = new Son();
        Son s = (Son) p1; // 关键就是进行一次强制类型转换。
        s.exercise();

        boolean ch = p1 instanceof Son;  // instanceof语句可以判断某个对象是不是属于这个类。是返回true，不是false。
        System.out.println(ch);          // a instanceof b，如果是true，那么把b改成b的父类，返回的也是true。
                            // 只有发生了多态，用instanceof判断才会出现父子同类的情况，本质是因为多态就是父的指针指向了子类。
                            //故强转类型实质就是，重新再申请一个子类的引用指向父类所指向的那个子类。

        Father p2 = new Father();      //这里没发生多态，所以父类和子类肯定不是同一个类，instanceof返回false。
        boolean cu = p2 instanceof Son;
        System.out.println(cu);
    }
}
