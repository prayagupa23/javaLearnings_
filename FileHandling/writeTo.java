package FileHandling;

import java.io.FileWriter;

public class writeTo {
    public static void main(String[] args) throws Exception{
        //4 ways to write a file: FileWriter, BufferedWriter, PrintWriter, FileOutputStream
        FileWriter fileWriter = new FileWriter("FileHandling/wrote.txt");
        String text = "Hello I am Prayag\n";
        fileWriter.write(text);
        fileWriter.append("I am an engineer\nStudying in Mumbai\n");
        fileWriter.close();
    }
}
