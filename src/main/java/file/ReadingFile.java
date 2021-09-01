package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws IOException {

        try {
            File x = new File("C:/sololearn/test.txt");
            Scanner scanner = new Scanner(x);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }

}

