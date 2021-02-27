package aag_Array;


public class B_double_dimension_array {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{2,5,4},{57,67,234,75}};
        System.out.println(arr1[2][2]);

        String arr2[][] = new String[4][7];
        arr2[2][5]="paul";
        System.out.println(arr2[2][5]);
        System.out.println(arr2.length);    //用数组名求长度，指的是最外层数组的长度。
        System.out.println(arr1[2].length); //指的是第二个元素的长度，{57,67,234,75}，故长度为4。
    }
}
