
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class Filesdemo {
    public static void main(String[] args) throws IOException {
       // Files.list(Paths.get(".")).forEach(System.out::println);
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Path CurrentDirectory = Paths.get(".");
        Files.walk(CurrentDirectory, 2).filter(predicate).forEach(System.out::println);
    }
}
