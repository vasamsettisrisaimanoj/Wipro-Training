import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copy {
    public static void main(String[] args) {
        try{
            Path sourcepath = Paths.get("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\DAY-8\\myfile.txt");
            Path Destination = Paths.get("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\DAY-8\\file.txt");
            Files.copy(sourcepath,Destination,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied Successfully");
        }catch(Exception e){
            System.out.println("Error copy file: "+e.getMessage());
        }
    }
}
