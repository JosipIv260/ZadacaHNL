package VjezbaIznimke;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrinterWriter {
public static void main(String[] args) throws IOException {
        Writer izlaz=new FileWriter("Print.txt");
        PrintWriter ispis=new PrintWriter(izlaz);
        ispis.println("Dobar dan");
        ispis.println(5);
        ispis.println(true);
        ispis.close();
    }
}
