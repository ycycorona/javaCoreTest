package com.TestMultiPackages;


public class CreatePerson{
    String name;
    int age;
    CreatePerson(){
        System.out.println("我位于TestMultiPackages包下");
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }

    static void say(String content){
        System.out.println(content);
    }
}
