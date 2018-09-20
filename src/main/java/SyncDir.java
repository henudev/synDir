import collection.MapTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 遍历一个路径下文件树.
 1，获取pathName的File对象

 2，判断该文件或目录是否存在，不存在时在控制台输出提醒

 3，判断如果不是一个目录，就判断是不是一个文件，时文件则输出文件路径

 4，获取此目录下的所有文件名与目录名的字符串数组

 5，如果是一个目录，搜索深度currentDepth+1，输出目录名后，进行递归

 6，如果是文件，则直接输出文件名
 */

public class SyncDir {
    //默认搜索深度
    private static int depth = 1;
    
    //遍历文件夹
    public static void getFileList(String filePath, int depth) throws IOException{
        File dirFile = new File(filePath);
        if (!dirFile.exists()) {
            System.out.println("NO EXITS");
            return;
        }
        // not a dir
        if (!dirFile.isDirectory()) {
            if (dirFile.isFile()) {
                System.out.println("AbsolutePathP::::::::::" + dirFile.getAbsolutePath());
                System.out.println("CanonicalPath::::::::::" + dirFile.getCanonicalPath());
                System.out.println("getCanonicalFile::::::::::" + dirFile.getCanonicalFile());
            }
            return;
        }
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.print("|--");
        System.out.println(dirFile.getName());
        
        //get all files and dirs in this dir.
        String[] fileList = dirFile.list();
        int currentDepth = depth + 1;
        for (int j =0; j < fileList.length; j++) {
            //遍历文件目录
            String str = fileList[j];
            File file = new File(dirFile.getPath(), str);
            String name  = file.getName();
            //if is a dir.
            if (file.isDirectory()) {
                //递归
                getFileList(file.getPath(), currentDepth);
            }else{
                //if is a file.
                for (int k = 0; k < currentDepth; k++) {
                    System.out.print("    ");
                }
                System.out.print("|--");
                System.out.println(name);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        //getFileList("D:\\java",depth);
        
        //map遍历
        Map<String, String> map = new HashMap<>();
        MapTest.workMap(map);
    }

}
