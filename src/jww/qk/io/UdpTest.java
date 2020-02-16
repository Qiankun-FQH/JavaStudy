package jww.qk.io;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -14:59
 **/
public class UdpTest {
    //发送
    @Test
    public void testsend() throws Exception {
        DatagramSocket socket = new DatagramSocket();

        String str = "UDp大宋";
        byte[] data = str.getBytes();
        InetAddress inet =
                InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);

        socket.send(packet);

        socket.close();
    }

    //接受
    @Test
    public void testReceiver() throws Exception {
        DatagramSocket socket =
                new DatagramSocket(9090);
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        socket.receive(packet);

        System.out.println(packet.getData().toString());
        socket.close();
    }
}
