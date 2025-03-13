package VjezbaIznimke;

import java.io.*;

public class FilewriterString {
    public static void main(String[] args) throws IOException {
        Reader ulaz=new StringReader("Dolazi nam pauza");
        Writer izlaz=new FileWriter("Pauza.txt");
        int zvakovi;
        while ((zvakovi= ulaz.read())!=-1){
            izlaz.write(Character.toUpperCase((char) zvakovi));
            izlaz.write('\n');
        }
        izlaz.close();
    }
}
