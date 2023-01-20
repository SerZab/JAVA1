package java_youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {

    File file = new File("testFile");
    PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            pw.println("Test row "+i);
        }
        pw.close();
    }

}
