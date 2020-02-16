package jww.qk.socket;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -14:14
 **/
public class TcpTest02 {
    @Test
    public void testClient() throws IOException {
        FileInputStream bis  =
                            new FileInputStream(
                                    new File("a.png"));
        Socket socket = new Socket("127.0.0.1",9988);

        OutputStream os = socket.getOutputStream();

        byte[] buffer = new byte[1024];

            int len;

            while ((len=bis.read(buffer))!=-1) {
                os.write(buffer, 0, len);
            }
                bis.close();
                os.close();
                socket.close();
    }
    @Test
    public void testServer() throws IOException {
        ServerSocket ss = new ServerSocket(9988);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        FileOutputStream bos =
                new FileOutputStream(
                                new  File("b.png"));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }

        bos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
