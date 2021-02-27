package aai_encapsulation;

public class Aa_encapsulation {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 95, 7, 8, 9, 87};
        int max = getmax(array1);
        System.out.println(max);
    }


    public static int getmax(int[] array) {           //这就是一个封装，等于是一个独立的函数。不需要调用外面的数据
        int max = array[0];                           //所以是个static的类型，但可以传数据给这个函数
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}//main函数也要包含在类里面