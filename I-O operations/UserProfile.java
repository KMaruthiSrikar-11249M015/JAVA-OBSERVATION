
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserProfile {
    public static void main(String[] args) throws IOException {
        String profile = "Name: bike\nAge: 20\nFitness Goal: Weight Loss";

        FileOutputStream fout = new FileOutputStream("profile.txt");
        fout.write(profile.getBytes());
        fout.close();

        FileInputStream fin = new FileInputStream("profile.txt");
        int ch;

        System.out.println("User Profile:");

        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        }

        fin.close();
    }
}