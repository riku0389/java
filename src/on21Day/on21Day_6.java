package on21Day;

import com.sun.codemodel.internal.JCase;

import java.util.Scanner;

/***
 * 题目：输入一个号码，判断号码。是1就是一等奖；2就是二等奖；3就是三等奖；其他就是阳光普照奖
 * 注意：如果不写break则会从匹配项开始向下穿透
 */
public class on21Day_6 {
    public static void main(String[] args) {
        switchNum();
    }

    private static void switchNum() {
        try {
            System.out.println("Please input number...");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("一等奖");
                    break;
                case 2:
                    System.out.println("二等奖");
                    break;
                case 3:
                    System.out.println("三等奖");
                    break;
                default:
                    System.out.println("阳关普照奖");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("输入错误的数据，请输入整数");
        }
    }
}
