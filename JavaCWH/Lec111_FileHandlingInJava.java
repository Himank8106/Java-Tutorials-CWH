package JavaCWH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Lec111_FileHandlingInJava {
    public static void main(String[] args) {
        File f = new File("XYZ.txt");
        
        // Code to create a new file
        /*
        try {
            f.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        */

        // Code to write in a file
        /*
        try {
            FileWriter fw = new FileWriter("XYZ.txt");
            fw.write("File name is XYZ.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        */

        // Reading a file
        /*
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        
        // Deleting a file
        if(f.delete()){
            System.out.println("File "+f.getName()+" is deleted.");
        }  
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
