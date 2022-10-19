import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();

            System.out.println(inetAddress);

            System.out.println(InetAddress.getLoopbackAddress());
            System.out.println(inetAddress.getByName("www.google.com"));
            System.out.println(inetAddress.getByName("www.naver.com"));

            byte[] address = InetAddress.getByName("www.naver.com").getAddress();

            for (int i = 0; i < address.length; i++){
                if (address[i] < 0){
                    System.out.println(address[i]+ 256);

                }
                else{
                    System.out.println(address[i]);
                }
            }
            System.out.println(Arrays.toString(address));
            System.out.println(InetAddress.getByName("www.naver.com").isReachable(200));
            System.out.println(InetAddress.getByName("www.google.com").isReachable(200));
            System.out.println(Inet4Address.getByName("127.0.0.1").isReachable(200));
            //네트워크는 데이터그램까지안감. transfort에서 끝남.


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}