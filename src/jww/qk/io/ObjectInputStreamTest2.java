package jww.qk.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -10:17
 **/
public class ObjectInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(
                                "a.dat"
                        )
                );
        Object read = ois.readObject();
        String str = (String) read;
        System.out.println(str);


        ois.close();
    }

}
