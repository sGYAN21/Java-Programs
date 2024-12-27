package in.challenge88;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the file name You want: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName))
        {
            int read;
            while ((read= reader.read())!= -1)
            {
                System.out.print((char) read);
            }
        }catch (FileNotFoundException exception)
        {
            System.out.printf("%s Not found", fileName);
        }
        catch (IOException exception){
            System.out.printf("Exception Occurred: %s", exception.getMessage());
        }
    }
}
