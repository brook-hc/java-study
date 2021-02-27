package aag_Array;

import java.util.Arrays;

//直接调用一些java提供数组的方法，省得我们去写代码了。
public class C_array_tools {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int[] arr2={1,3,2,4,10,5,6,15,34,11};
        boolean isequal=Arrays.equals(arr1,arr2);   //判断2个数组是否相等。
        System.out.println(isequal);

        System.out.println(Arrays.toString(arr1));  //输出所有元素。。

        Arrays.fill(arr1,32);       //把一个数组的所有元素都改为指定的一个值。
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);          //从小到大排序,注意，这个排序会直接改变原数组。
        System.out.println(Arrays.toString(arr2));

        int i = Arrays.binarySearch(arr2,55);  //如果返回的是负数，代表未找到。若找到，返回的是元素下标。
        System.out.println(i);      //由于上面排序了，所以返回的是排序后的位置。

    }
}
