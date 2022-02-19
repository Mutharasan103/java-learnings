import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDirectories {
    public static void main(String[] args) {
        //JSONParser parser = new JSONParser();
        try (FileReader fileReader = new FileReader("C:\\Mutharasan\\repo\\FileCreate\\employee.json")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File("C:\\Mutharasan\\repo\\FileCreate\\employee.json");
        boolean present = file.exists();

        if (present==false)
        {
            try {
                boolean created = file.createNewFile();
                System.out.println("File created "+created);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        present = file.exists();
        System.out.println(present);



    }
}
