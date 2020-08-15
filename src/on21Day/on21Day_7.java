package on21Day;

/***
 * while、do...while、for
 * 题目1：求1-100之和
 * 题目2：嵌套循环，在控制台输出九九乘法表
 */

public class on21Day_7 {
    public static void main(String[] args) {
        sumNumner_while();
        sumNumber_dowhile();
        sumNumber_for();
        jiujiuTable();
    }

    private static void sumNumner_while() {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("1-100之和是：" + sum);
    }

    private static void sumNumber_dowhile() {
        int num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= 100);
        System.out.println("1-100之和是：" + sum);
    }

    private static void sumNumber_for() {
        int sum = 0;
        for (int num = 0; num <= 100; num++) {
            sum += num;
        }
        System.out.println("1-100之和是：" + sum);
    }

    private static void jiujiuTable() {
        int sum;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                sum = i * j;
                System.out.print(j + "*" + i + "=" + sum + "\t");
            }
            System.out.println();
        }
    }
}
