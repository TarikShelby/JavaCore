package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello evrybody");
        pw.println("piupi ");
        pw.close();
        // только текстовые значение 
    }
}
