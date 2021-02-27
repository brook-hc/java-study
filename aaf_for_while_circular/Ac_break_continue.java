package aaf_for_while_circular;

public class Ac_break_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                //break; //输出结果为123，break会直接终止循环，也即跳出整个for循环。
                continue;   //输出结果为：123 567 9 10，continue只跳过本次循环，立即去执行下一次循环，不会终止循环。
            }
            System.out.print(i + "\t");
        }
    }
}
