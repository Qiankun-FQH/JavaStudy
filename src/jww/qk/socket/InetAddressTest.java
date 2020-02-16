package jww.qk.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -13:33
 **/
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("192.168.232.128");
        System.out.println(inetAddress);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        InetAddress byName2 = InetAddress.getByName("127.0.0.1");
        System.out.println(byName2);

        InetAddress byName3 = InetAddress.getLocalHost();
        System.out.println(byName3);

        System.out.println(byName3.getHostName());


    }
}
