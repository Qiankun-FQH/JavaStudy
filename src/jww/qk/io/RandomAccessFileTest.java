package jww.qk.io;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -12:34
 **/
public class RandomAccessFileTest {

    public static void main(String[] args) throws Exception {
        RandomAccessFile raf;
        raf = new RandomAccessFile(
                new File("a.txt"),
                "rw"
        );
        RandomAccessFile raf2;
        raf2 = new RandomAccessFile(
                new File("c.txt"),
                "rw"
        );

        byte[] buffer = new byte[1024];
        int len;
        while((len = raf.read(buffer)) != -1){
            raf2.write(buffer,0,len);
        }
        raf.close();
        raf2.close();
    }
    @Test
    public void test1() throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile(
                       new File("a.txt"),
                       "rw"
                );

        raf.seek(3);
        raf.write("xyz".getBytes());

        raf.close();
    }
    @Test
    public void test2() throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile(
                        new File("a.txt"),
                        "rw"
                );

        raf.seek(3);

        StringBuilder builder = new StringBuilder((int) new File("a.txt").length());
        byte[] buffer = new byte[1024];
        int len;
        while((len=raf.read(buffer))!=-1){
            builder.append(new String(buffer,0,len));
        }

        raf.seek(3);
        raf.write("xyz".getBytes());

        raf.write(buffer.toString().getBytes());
        raf.close();
    }
}
