package on21Day;

import java.util.Scanner;

/***
 * 字符串
 * 1、定义一个字符串
 * 2、获取字符串长度
 * 3、字符串拼接
 * 4、字符串大小写转换
 * 5、去除字符串的空格
 */

public class on21Day_9 {
    public static void main(String[] args) {
        testString();
    }

    //String
    private static void testString() {
        System.out.println("Please input string...");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.length()); //字符串的长度
        System.out.println(str + " hahaha");//字符串拼接
        System.out.println(str.toUpperCase()+"\t"+str.toLowerCase());//大小写转换
        System.out.println(str.trim());//去掉字符串空格
    }
}
