import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        readFile();
    }

    // This method tries to read a file and throw IOException if file is not found.
    public static void readFile() {
        // try-with-resource that automatically close the resources
        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            // Reading the file line by line
            while ((line = reader.readLine()) != null) {
                // Printing each line
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
