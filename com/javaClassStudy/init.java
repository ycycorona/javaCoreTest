package com.javaClassStudy;

import java.util.Scanner;

public class init {
    private static void outName(Object ob){
        if(ob instanceof GreatGoodPerson){
            GreatGoodPerson tmpOb = (GreatGoodPerson)ob;
            System.out.println(tmpOb.getName()+":"+tmpOb.sayName());
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        while(sc.hasNext()){
            System.out.println("键盘输入内容是："+sc.next());
        }
    }
}
