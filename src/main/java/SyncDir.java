import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 同步一个文件夹周期内文件.
 */
public class SyncDir {

    //遍历文件夹
    public static List<File> getFileList(String fileSrcPath){
        File file = new File(fileSrcPath);
        File[] files = file.listFiles();
        List<File> fileList = new ArrayList<File>();




        return fileList;
    }

    //远程拷贝

}
