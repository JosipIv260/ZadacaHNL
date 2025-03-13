package VjezbaIznimke;

import java.io.*;

public class FailRiderDatoteka {
        public static void main(String[] args) throws IOException {
            File inputFile=new File("Datoteka1.txt");
            File outputFile=new File("Kopija.txt");
            try (FileReader ulaz=new FileReader(inputFile);FileWriter izlaz=new FileWriter(outputFile)){

                int c;
                while ((c = ulaz.read()) != -1) {
                    izlaz.write(c);
                }
        }catch(FileNotFoundException e) {
                System.err.println("Greška" + e.getMessage());
            }
        }
}
