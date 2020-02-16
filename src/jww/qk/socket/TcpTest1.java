package jww.qk.socket;

import com.sun.security.ntlm.Server;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -13:58
 **/
public class TcpTest1 {
    @Test
    public void testclient() throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");

            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();

            os.write("我输WWJ".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            os.close();
            socket.close();
        }
    }

    @Test
    public void testserver() throws IOException {
        ServerSocket ss = new ServerSocket(8899);
        Socket accept = ss.accept();

        InputStream is = accept.getInputStream();

        ByteArrayOutputStream baos =
                new ByteArrayOutputStream();
        byte[] buffer = new byte[5];

        int len;

        while ((len=is.read(buffer))!=-1){
            baos.write(buffer,0,len);
        }
        System.out.println(baos.toString());

        System.out.println("IP"+ss.getInetAddress().getHostName());

        baos.close();
        is.close();
        ss.close();
        accept.close();
    }

}
