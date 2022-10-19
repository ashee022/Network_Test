import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {




    ServerSocket serverSocket;
    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;

    public void startServer(){
        try {
            serverSocket = new ServerSocket(3000);
            //serverSocket.bind(new InetSocketAddress.getbyname("123123123",3000));
            System.out.println("Listening...");
            clientSocket = serverSocket.accept();
            System.out.println("Accect...");
            out = new PrintWriter(clientSocket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            if(message.equals("hello server")){
                out.println("hello");
            }
            else {
                System.out.println("getout");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void stopServer() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args){
        Main main = new Main();
        main.startServer();
    }

}