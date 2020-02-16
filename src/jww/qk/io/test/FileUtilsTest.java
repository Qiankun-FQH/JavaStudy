package jww.qk.io.test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -13:20
 **/
public class FileUtilsTest {
    public static void main(String[] args){
        File src = new File("a.txt");
        File des = new File("f.txt");

        try {
            FileUtils.copyFile(src,des);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
