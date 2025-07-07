//file read in java
package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class readFile {
    // there are two ways to read from a file in java --> Scanner(for small text) &
    // FileReader class(for production)
    public static void main(String[] args) throws Exception {
        File file = new File("FileHandling/secrets.txt");
        Scanner s = new Scanner(file);
        FileReader readFile = new FileReader("FileHandling/art.txt");
        if (file.exists()) {
            System.out.println("File exists. Here's it's contents: ");
            String content = s.nextLine();
            System.out.println(content);
        } else {
            System.out.println("File does not exists.");
        }

        System.out.println("\nDisplaying contents of a file using FileReader: \n");
        int batman = readFile.read();
        //when there's no line left to read in a file, the .read() method returns -1.
        while(batman != -1){
            System.out.print((char) batman);
            batman = readFile.read();
        }
        readFile.close();
    }
}
