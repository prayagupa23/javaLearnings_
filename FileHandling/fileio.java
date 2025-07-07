//file handling
package FileHandling;

import java.io.*;

public class fileio {
    public static void main(String[] args) throws Exception {
        // file - it is an abstract representation of file and directory pathnames.
        File file = new File("FileHandling/secrets.txt");
        if (file.exists()) {
            System.out.println("File Exists");
            System.out.println("Here's the path: " + file.getPath());
            System.out.println("Here's the absolute path: " + file.getAbsolutePath());
            System.out.println("File check: " + file.isFile());
            // file.delete() <-- to delete a file
        } else {
            System.out.println("File does not exist");
        }
    }
}
