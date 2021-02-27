package aaf_for_while_circular;

public class Ad_lable_break_cotinue {
    public static void main(String[] args) {
       l: for (int i = 1; i <= 4; i++) {       //加了标签后，break和continue可以指定作用在哪一层循环上。
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                   break l;      //结果为123,因为它直接跳出了最外层的for循环。
                    //continue l;     //结果为：123 123 123 123，终止的是外层for的一轮循环。
                }
                System.out.print(j+"\t");
            }
        }
    }
}
