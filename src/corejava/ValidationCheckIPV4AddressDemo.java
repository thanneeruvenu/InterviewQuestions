package corejava;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class ValidationCheckIPV4AddressDemo {
    public static void main(String[] args) {

        // have to check given ip address is IPV4 or not
        String ipv4Address = "192.168.31.58";

        try {
            if (Inet4Address.getByName(ipv4Address).getHostAddress().equals(ipv4Address))
                System.out.println("Valid");
            else
                System.out.println("Not Valid");
        } catch (UnknownHostException e) {
            System.out.println("Not Valid");
            e.printStackTrace();
        }
    }
}
