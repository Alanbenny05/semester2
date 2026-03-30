import java.io.*;

public class FileWriteReadDemo {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample file.\n");
            writer.write("Java File Handling Example.\n");
            writer.write("Reading and Writing files is easy!");
            writer.close();

            System.out.println("Data written to file successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("Reading from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}