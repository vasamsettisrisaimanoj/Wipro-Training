import java.io.File;

public class rename {
    public static void main(String[] args) {
        File oldFile = new File("myfile.txt");
        File newFile = new File("newname.txt");
        if(oldFile.renameTo(newFile)){
            System.out.println("Renamed Successfully");
        }else{
            System.out.println("Failed to Rename");
        }
    }
}
