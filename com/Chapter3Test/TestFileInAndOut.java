package com.Chapter3Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by ycy42 on 2018/2/20.
 */
public class TestFileInAndOut {
    public static void main (String[] args) throws IOException {
        Scanner fileIn = new Scanner(Paths.get("C:\\Users\\ycy42\\Desktop\\java_test.txt"), "UTF-8");

    }
}
