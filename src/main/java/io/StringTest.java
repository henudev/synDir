package io;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringTest {

    //十六进制转换十进制
    public static int hex2Decimal(String hex){
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexChar2Decimal(hexChar);
        }
        return decimalValue;
    }

    //
    public static int hexChar2Decimal(char hexChar){
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        }else {
            return hexChar - '0';
        }
    }

    //PrintWriter
    public static void outPutStr(File file) throws Exception{
        PrintWriter pw = new PrintWriter(file);
        pw.print("test");
        pw.close();
    }

    //new File
    public static File newFile(String path) throws Exception{
        File file = new File(path);
        System.out.println("file is " + (file.exists()?true : file.createNewFile()));
        return file;
    }

    //read from one file
    public static void readFile(String path) throws Exception{
        File file = newFile(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("****\n" + str);
        }
        scanner.close();
    }
}
