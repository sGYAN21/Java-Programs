package in.FileWriter;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args){
        String fileName ="java-course.txt";

        try (FileWriter writer= new FileWriter(fileName)) {

            writer.write("This is the best java course.");
            writer.flush();
            System.out.println("File Written Successfully");
        }catch (IOException exception)
        {
            System.out.printf("exception occurred %s\n",exception.getMessage());
        }
    }
}
