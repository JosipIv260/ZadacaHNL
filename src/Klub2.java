import  java.util.Scanner;
public class Klub2 {
    private int IDKlub;
    private int IDUtaknice;
    // podaci trener
    private String ImeTrener;
    private String PrezimeTrener;
    int GodIskTrener;
    //Osobine Igrača
    private int DresIgraca;
    private int VelKop;
    private String Ime;
    private String Prezime;
    // klub
    private int ID;
    private int Rezultat;
    private String ImeKluba;
    private String Grad;
    // Vrsta terena
    private String VrstaTerena;
    //Skener
    Scanner sc= new Scanner(System.in);
    // konstruktor za trenera
    public Klub2(String imeTrener, String prezimeTrener, int godIskTrener) {
        this.ImeTrener = imeTrener;
        this.PrezimeTrener = prezimeTrener;
        this.GodIskTrener = godIskTrener;
    }// Osobine igraca

    public Klub2(int dresIgraca, String ime, String prezime) {
        this.DresIgraca = dresIgraca;
//            this.VelKop = velKop;
        this.Ime = ime;
        this.Prezime = prezime;
    }//Klub
    public Klub2(String grad,int rezultat,String imeKluba,int id,String vrstaTerena){
        this.Grad=grad;
        this.Rezultat=rezultat;
        this.ImeKluba=imeKluba;
        this.ID=id;
        this.VrstaTerena=vrstaTerena;
    }


    // Utaknica ispis
    public String toString() {
        return ImeTrener+"\t"+PrezimeTrener+" godine iskustva: "+GodIskTrener+" \nStrijelci";

    }
}

