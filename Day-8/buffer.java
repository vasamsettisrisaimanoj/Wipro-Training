import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        try{
            //creating a file
            File file = new File("C:/Users/vasam/OneDrive/Desktop/vscode/Day-8/myfile1.txt");
            file.createNewFile();
            System.out.println("File is Created");
            
            //writing a file
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(file));
            bwriter.write("This is written using Buffered writer");
            bwriter.newLine();
            bwriter.write("This is next Line");
            bwriter.close();
            
            //reading a file
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
