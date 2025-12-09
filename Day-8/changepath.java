import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class changepath {
    public static void main(String[] args) {
        Path sourcepath = Paths.get("C:\\Users\\vasam\\OneDrive\\Desktop\\sample.txt.txt");
        Path Destination = Paths.get("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\DAY-8\\myfile.txt");   
        try{
            Files.copy(sourcepath,Destination,StandardCopyOption.REPLACE_EXISTING);
            Files.delete(sourcepath);
            System.out.println("Path Changed Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
