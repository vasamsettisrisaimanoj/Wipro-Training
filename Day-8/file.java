import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class file {
    public static void main(String[] args) {
        try{
            //creating a file
            File file = new File("C:/Users/vasam/OneDrive/Desktop/vscode/Day-8/myfile.txt");
            file.createNewFile();
            System.out.println("File is Created");
            //writing a file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World!");
            writer.close();

            //reading a file
            FileReader reader = new FileReader(file);
            int ch;
            System.out.println("File content:");
            while((ch=reader.read()) != -1){
                System.out.println((char)ch);
            }
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line+"  ");
            }
            br.close();
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
    }
}