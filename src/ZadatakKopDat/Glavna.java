package ZadatakKopDat;

import java.io.IOException;
import java.io.*;

public class Glavna {
    public static void main(String[] args)throws IOException {
        File inputFile = new File("C:\\Users\\38598\\OneDrive - Sveučilište u Rijeci\\Dokumenti\\VjezbaJednostavna\\original.pdf");
        File outputFile = new File("C:\\Users\\38598\\OneDrive - Sveučilište u Rijeci\\Dokumenti\\VjezbaJednostavna\\original2.pdf");

        try (FileInputStream ulaz = new FileInputStream (inputFile);
             FileWriter izlaz = new FileWriter(outputFile)) {
        int c;
        while ((c=ulaz.read())!=-1){
            izlaz.write(c);
        }
        }catch (FileNotFoundException e){
            System.out.println("Greška: "+e.getMessage());
        }
        if (outputFile.canExecute()){
            System.out.println("unesite da li ce se obrisati original d/n");
            char a1='d';
            if (a1=='d'){
                inputFile.delete();
            }
        }
    }
}
