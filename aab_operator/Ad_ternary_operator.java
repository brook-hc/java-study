package aab_operator;

public class Ad_ternary_operator {
    public static void main(String[] args) {
        int m = 10;
        int n = 15;
        int max_num = (m > n) ? m : n;
        System.out.println(max_num);
        String max_n = (m > n) ? "m大" : ((m == n) ? "相等" : "n大");  //嵌套用法
        System.out.println(max_n);
    }
}
