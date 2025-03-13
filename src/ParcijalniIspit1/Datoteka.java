package ParcijalniIspit1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Datoteka  {

    public void IspisListe(List<String> lista) {
        File inputFile = new File("C:\\Users\\38598\\OneDrive - Sveučilište u Rijeci\\Dokumenti\\VjezbaJednostavna\\ispit.txt");
        try (FileWriter writer = new FileWriter(inputFile)) {
            for (String element : lista) {
                writer.write(element + "\n");
            }
            System.out.println("Podaci su uspješno zapisani u datoteku: " + inputFile);
        } catch (IOException e) {
            System.out.println("Došlo je do greške prilikom pisanja u datoteku: " + e.getMessage());
        }
    }
    public void UnosPodataka (){
        File inputFile = new File("C:\\Users\\38598\\OneDrive - Sveučilište u Rijeci\\Dokumenti\\VjezbaJednostavna\\ispit.txt");
        List<String> linije = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String linija;
            while ((linija = reader.readLine()) != null) {
                System.out.println(linija);
                linije.add(linija);
            }
        } catch (IOException e) {
            System.out.println("Došlo je do greške prilikom čitanja datoteke: " + e.getMessage());
        }

    }public void ucitajpodatkeizdatoteke(List<String> linije) {
        System.out.println("Sadržaj datoteke:");
        for (String linija : linije) {
            System.out.println(linija);
        }
    }
}

