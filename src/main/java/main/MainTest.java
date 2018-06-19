package main;

import io.StringTest;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MainTest {
    //
    public static void main(String[] args) throws Exception{
          //初始化测试类
          StringTest strTest = new StringTest();
//        strTest.newFile("d:\\test2.txt");
//        System.out.println("sss");

//            strTest.readFile("d:\\test.txt");
        ArrayList arrTest = strTest.scannerFromInput();
        for (int i = 0; i < arrTest.size(); i++) {
            System.out.println("sssss" + arrTest.get(i));
        }

    }

}