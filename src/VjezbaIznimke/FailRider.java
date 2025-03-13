package VjezbaIznimke;
//import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;
public class FailRider {
    public static void main(String[] args) throws IOException {
        File inputFile=new File("Datoteka1.txt");
        FileReader ulaz=new FileReader(inputFile);
        int c;
        while ((c= ulaz.read())!=-1){
            System.out.print((char) c);
        }
    }
}
