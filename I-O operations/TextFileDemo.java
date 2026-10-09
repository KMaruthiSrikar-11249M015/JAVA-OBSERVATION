
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("message.txt");
        fw.write("Welcome to Java Programming!");
        fw.close();

        FileReader fr = new FileReader("message.txt");
        int ch;

        System.out.println("File Content:");

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}