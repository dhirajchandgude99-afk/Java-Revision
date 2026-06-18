import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, Dhiraj!");
            writer.close();
            System.out.println("Data written successfully.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
