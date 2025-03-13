package ParcijalniIspit1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EvidencijaVozila {
    public static void main(String[] args) {
        List<String>lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);


           Automobil auto1 = new Automobil("RI 232 BI", "Reno", 2006, 5);
           auto1.setGodinaProizvodnje(auto1.getGodProizvodnje());
           lista.add(auto1.toString());
           Automobil auto2 = new Automobil("RI 435 AV", "Škoda", 2017, 5);
           auto2.setGodinaProizvodnje(auto2.getGodProizvodnje());
           lista.add(auto2.toString());
           Automobil auto3 = new Automobil("PU 546 RS", "Audi", 2020, 3);
           auto3.setGodinaProizvodnje(auto3.getGodProizvodnje());
           lista.add(auto3.toString());
           Motocikal motor1 = new Motocikal("RI 432 C", "Yamaha", 2017, "Cestovni");
           motor1.setGodinaProizvodnje(motor1.getGodProizvodnje());
           lista.add(motor1.toString());
           Motocikal motor2 = new Motocikal("RI 325 VJ", "KTM", 2019, "Brdski");
           motor2.setGodinaProizvodnje(motor2.getGodProizvodnje());
           lista.add(motor2.toString());


        Datoteka datoteka=new Datoteka();
        datoteka.IspisListe(lista);
        datoteka.UnosPodataka();


    }
}
