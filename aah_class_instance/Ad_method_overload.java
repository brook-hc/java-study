package aah_class_instance;

//重载满足2同2不同：用一个类，相同的函数名。不同的形参类型和顺序。
//重载跟方法的修饰符（public，private）和是否有返回值，返回的类型都没关系。
class Ad_method_overload {

    public static void main(String[] args) {
        Ad_method_overload text = new Ad_method_overload();
        text.add(4,5);
        text.sum("hello","world");
    }

    public void add(int a,int b) {
        System.out.println(a + b);
    }
    public void add(double a,double b){
            System.out.println(a+b);
    }
    public void get(String s, int a){
        System.out.println(s+a);
    }
    public void get(int a,String s){
        System.out.println(s+a);
    }

    //形参个数可变的方法
    public void sum(String s){
        System.out.println("string s");
    }

    public void sum(String ...s){       //形参个数可变的写法，与上面的函数发生重载。且这种方法只能定义在形参列表的末尾。
        System.out.println("string...s");   //s的本质是个数组。
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);       //可以按照数组的方式输出值。
        }
    }
//    public void sum(String[] s){        //注意形参是数组的形式与上面是一样的，编译器认为他们是相同的，所以报错。
//        System.out.println();
//    }





}

