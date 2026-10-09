
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting for client...");

        Socket s = ss.accept();
        DataInputStream dis =
            new DataInputStream(s.getInputStream());

        String message = dis.readUTF();
        System.out.println("Client says: " + message);

        dis.close();
        s.close();
        ss.close();
    }
}