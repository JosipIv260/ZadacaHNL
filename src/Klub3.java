public class Klub3 {
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
    // Osobine igraca

    public Klub3(int dresIgraca, int velKop, String ime, String prezime) {
        this.DresIgraca = dresIgraca;
        this.VelKop = velKop;
        this.Ime = ime;
        this.Prezime = prezime;

    }
    // Utaknica ispis

    public String toString() {
        return DresIgraca+"\t"+Ime+"\t"+Prezime;
    }
}

