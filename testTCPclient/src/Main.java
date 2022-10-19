import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;
import java.net.SocketImpl;

public class Main {
    public static void main(String[] args) throws IOException {

        //Socket socket = new Socket("127.0.0.1",3000, null, 4004);
        Socket socket = new Socket("127.0.0.1",3000);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("hello server");
        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println(in.readUTF());


        FileInputStream fo = new FileInputStream("C:/Users/user/ip.png");

        int len;

        while((len =in.read())!=-1){
            out.write(len);
        }




        socket.close();
    }
}