import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;

public class Main {

    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;

    public void serverConnection() {
        try {
            // clientSocket = new Socket("127.0.0.1", 3000);
            clientSocket = new Socket(Inet4Address.getByName("127.0.0.1"), 3000);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            InputStream is = clientSocket.getInputStream();
            FileOutputStream fo = new FileOutputStream("C:/Users/Q/Nox_share/ttestpho.png");

            int len;

            while((len =is.read())!=-1){
                out.write(len);
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            out.println(message);
            String response = in.readLine();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.serverConnection();
        main.sendMessage("Hello Server!");
    }

}