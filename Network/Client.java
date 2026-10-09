
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);

        DataOutputStream dos =
            new DataOutputStream(s.getOutputStream());

        dos.writeUTF("Hello Server!");
        dos.flush();

        dos.close();
        s.close();
    }
}