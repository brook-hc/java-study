package aag_Array;

public class A_array_bulid_use {
    public static void main(String[] args) {
        int[] array01 = new int[100]; // 这是动态初始化数组,开辟100长度的内存空间，默认元素都为0.
        int[] array02 = {3, 4, 5, 645, 453, 345, 345, 345, 343, 45, 567, 5, 86, 8, 68, 68}; // 这是静态初始化

        System.out.println(array02[0]);
        System.out.println(array02);//显示数组的地址指
        array02[2] = 48;// 给数组赋值
        System.out.println(array02[3]);
        int len;
        len = array02.length;
        System.out.println(len);//求数组的长度
        for (int i = 0; i < array02.length; i++) { //快捷方式：数组名称.fori直接回车，吊炸天！
            System.out.println(array02[i]);
        }

    }
}