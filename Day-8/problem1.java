import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.io.*;
public class problem1 {
    public static void main(String[] args) {
        try{
            //creating a file
            File file1 = new File("C:/Users/vasam/OneDrive/Desktop/vscode/Day-8/essay.txt");
            file1.createNewFile();
            System.out.println("File is Created");

            //writing a file
            BufferedWriter bwrite = new BufferedWriter(new FileWriter(file1));
            bwrite.write("This is written using Buffered writer");
            bwrite.newLine();
            bwrite.write("This is next Line");
            bwrite.newLine();
            bwrite.write("This is Third Line");
            bwrite.close();

            //Reading the file
            BufferedReader bReader = new BufferedReader(new FileReader(file1));
            String line;
            int linecount = 0,wordcount = 0;
            while((line = bReader.readLine()) != null){
                System.out.println(line);
                linecount+=1;
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordcount += tokenizer.countTokens();
            }
            bReader.close();
            System.out.println("The numbers of Words are "+wordcount);

            //creating a another new file
            File file2 = new File("C:/Users/vasam/OneDrive/Desktop/vscode/Day-8/report.txt");
            file2.createNewFile();
            System.out.println("New File is Created");

            //writing a file
            BufferedWriter bwriter = new BufferedWriter(new FileWriter(file2));
            bwriter.write("Total number of lines: "+linecount);
            bwriter.newLine();
            bwriter.write("Total number of words: "+wordcount);
            bwriter.close();

            //prints success message
            System.out.println("Report generated successfully! ");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
