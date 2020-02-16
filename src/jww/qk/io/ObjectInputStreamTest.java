package jww.qk.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -10:17
 **/
public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream(
                                "a.dat"
                        )
                );
        oos.writeObject(new String("啊啊是叫你啥"));

        oos.flush();

        oos.close();
    }


}
