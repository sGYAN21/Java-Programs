package in.FileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileReader reader = new FileReader(fileName)){
            int read =0;
            do {
                read = reader.read();
                System.out.print((char)read);
            }while (read!=-1);
        }catch (IOException e)
        {
            System.out.printf("exception occurred : %s", e.getMessage());
        }

    }
}
