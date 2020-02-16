package jww.qk.io.test;

import java.io.*;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -9:17
 **/
public class TestIO01 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(
                        new File("a.txt")
                ));
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(
                        new File("b.txt")
                ));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1){
            bos.write(buffer, 0, len);
        }
        bos.close();
        bis.close();
        BufferedInputStream bis2 =
                new BufferedInputStream(new FileInputStream(
                        "a.txt"
                ));
    }
}
