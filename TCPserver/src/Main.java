import java.io.*;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    // TCP Server
    ServerSocket serverSocket;
    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;

    public void startServer() {
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(Inet4Address.getByName("127.0.0.1"), 3000));
            System.out.println("Listen......");
            clientSocket = serverSocket.accept();
            System.out.println("Accept");
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            System.out.println(message);
            if (message.equals("Hello Server!")) {
                out.println("Hello Client!");
            } else {
                out.println("Get Out!");
            }


            File file = new File("C:/Users/Q/Pictures/testpho.png");
            FileInputStream fileIn = new FileInputStream(file);
            int len;

            while((len =fileIn.read())!=-1){
                fileIn.write(len); //
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopServer() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startServer();
    }
}