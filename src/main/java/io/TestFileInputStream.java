package io;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        String path = "d:\\test.txt";
        TestFileInputStream testFileInputStream = new TestFileInputStream();
        TestFileInputStream.readFileByFileInputStream(path);
    }

    //test FileInputStream
    public static void readFileByFileInputStream(String path) throws IOException {
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(path);
        int n = 1024;
        byte buffer[] = new byte[n];
        System.out.println("fileInputStream:::::");
        while ((fileInputStream.read(buffer, 0, n)) != -1 && (n > 0)) {
                System.out.println(new String(buffer));
        }
        fileInputStream.close();
    }
}
