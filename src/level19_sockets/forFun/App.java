package level19_sockets.forFun;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address1 = InetAddress.getByName("yandex.ru");
        InetAddress address2 = InetAddress.getByName("yandex.com");
        InetAddress address3 = InetAddress.getByName("javarush.ru");
        InetAddress address4 = InetAddress.getByName("localhost");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);

    }
}