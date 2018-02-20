package com.javaClassStudy;

class CreatePerson{
    private String name;
    private int age;
    final double hasMoney;
    public CreatePerson(String name, int age){
        this.age = age;
        this.name = name;
        this.hasMoney = 1000;
    }
/*    Person (String n){
        this.name = n;
    }
    Person (String n,int a){
        this(n);
        this.age = a;
    }*/
    public String getName(){
        return name;
    }
    public int getAge(){
      return this.age;
    }

    static void say(String content){
        System.out.println(content);
    }
}


class GreatGoodPerson extends CreatePerson{
    public GreatGoodPerson(String name, int age){
        super(name, age);
        System.out.println("CreatGoodPerson构造函数执行");
    }
    public String sayName(){
        return super.getName();
    }
}


