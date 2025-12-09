import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferUnderflowException;

public class problem2 {
    public static void main(String[] args) {
        try{
            File file1 = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\Day-8\\file1.txt");
            BufferedReader bReader1 = new BufferedReader(new FileReader(file1));
            File file2 = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\Day-8\\file2.txt");
            BufferedReader bReader2 = new BufferedReader(new FileReader(file2));

            //mergedfile
            File mergedfile = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\Day-8\\merged.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedfile));
            String linef1 = bReader1.readLine();
            String linef2 = bReader2.readLine();
            while (linef1 != null || linef2 != null) {
                if(linef1 != null){
                    writer.write(linef1);
                    writer.newLine();
                    linef1 = bReader1.readLine();
                }
                if(linef2 != null){
                    writer.write(linef2);
                    writer.newLine();
                    linef2 = bReader2.readLine();
                }
            }
            bReader1.close();
            bReader2.close();
            writer.close();
            System.out.println("Merge Completed Successfully");
            File newfile = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\vscode\\Day-8\\merged.txt");
            BufferedReader merg = new BufferedReader(new FileReader(newfile));
            String line;
            while((line = merg.readLine()) != null){
                System.out.println(line);
            }
            merg.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
