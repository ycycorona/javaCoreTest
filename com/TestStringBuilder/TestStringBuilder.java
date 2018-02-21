package com.TestStringBuilder;

import java.util.Scanner;

public class TestStringBuilder {
    public static void main(String[] args) {
        //测试StringBuilder
        StringBuilder str_build = new StringBuilder();
        Scanner userIn = new Scanner(System.in);
        Boolean isContinueInput = true;
        while (isContinueInput) {
            System.out.println("输入字符：");
            String nextString = userIn.next();

            if (nextString.equals("finish")) {
                isContinueInput = false;
                continue;
            }
            str_build.append(nextString);
        }

        String str = str_build.toString();

        System.out.println(str.equals("") ? "未输入" : str);

    }
}
