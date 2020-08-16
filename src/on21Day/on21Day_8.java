package on21Day;

import com.sun.tools.javac.code.Attribute;

/***
 * break和continue
 * break：可以跳出当前层循环
 * continue：表示跳出本次循环，进入下一次循环
 * 题目1：从1-10之中，当执行第五次时，打印"第五次执行完毕，退出循环"
 * 题目2：for(int i = 0;i< 10;i++){
 *     if(i == 3){
 *         continue;
 *     }
 *     System.out.println("num is: " + i );
 * }执行代码块，打印输出内容是？
 */

public class on21Day_8 {
    public static void main(String[] args) {
        loop();
    }

    //第一题
    private static void loop() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("第" + i + "次循环执行完毕，退出循环");
                break;
            }
            System.out.println("第" + i + "次循环执行完毕");
        }
    }

    //第二题
    /***
     * continue 只退出本次循环，不影响下一次的循环
     *打印结果是：
     * num is: 0
     * num is: 1
     * num is: 2
     * num is: 4
     * num is: 5
     * num is: 6
     * num is: 7
     * num is: 8
     * num is: 9
     */
}
