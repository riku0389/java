package on21Day;

import java.util.Scanner;

/***
 * if...else
 * 题目：输入考试成绩，如果成绩大于80，打印优秀
 * 成绩大于60打印及格，成绩小于60打印不及格
 */
public class on21Day_5 {
    public static void main(String[] args) {
        System.out.println("Please input Score...");
        Scanner sc = new Scanner(System.in);
        float score = sc.nextFloat();
        scoreLevel(score);
    }

    public static void  scoreLevel(float score) {
        if (score > 80) {
            System.out.println("优秀");
        } else if (score <= 80 && score > 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
