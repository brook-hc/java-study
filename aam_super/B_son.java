package aam_super;

    public class B_son extends A_father {
        int a = 3;
        int b = 4;

        public void show(){
            System.out.println(super.b); // super不能在static函数中用，比如main函数里想用就不行。
        }                               // super只能在son类中去使用。
        public void display(){
            super.show(1988);
        }

}
