import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetLampType {
    public String getType() throws FileNotFoundException {
        Scanner in = new Scanner(new File("param"));
        return in.nextLine();
    }
}
