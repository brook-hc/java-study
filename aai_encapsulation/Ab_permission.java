package aai_encapsulation;

public class Ab_permission {
    /*
        修饰符        类内部        同一个包        不同包的子类        同一个工程
        private      yes
        缺省(无)      yes          yes
        protected    yes          yes            yes
        public       yes          yes            yes              yes
    */
    public static void main(String[] args) {
        pdd ad = new pdd();
        System.out.println(ad.a);
    }
    // 1、class只能是public和 缺省。
    // 2、在类中定义类可以不创建新的java文件，但是必须有个static，不知道问什么？
    public static class pdd{
        int a =10;
    }
}

