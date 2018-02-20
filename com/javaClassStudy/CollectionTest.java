package com.javaClassStudy;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ycy42 on 2017/8/6.
 */
public class CollectionTest {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<String>();
        c.add("ycy");
        c.add("whh");
        c.add("6");

        c.forEach(cstr -> System.out.println(cstr.length()));
       /* System.out.println(objarry[0] instanceof String);*/

    }
}
