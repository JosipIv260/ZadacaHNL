package ParcijalniIspit1;

public class Automobil extends  Vozilo{
    private  int BrojVrata;

    public Automobil(String regBroj, String marka, int godProizvodnje,int brojVrata) {
        super(regBroj, marka, godProizvodnje);
        this.BrojVrata=brojVrata;
    }

    @Override
    public String ucitajPodatke() {
        return super.ucitajPodatke()+" Broj vrata"+BrojVrata;
    }
    public void brojvrata(){
        System.out.println("Broje vrata je: "+BrojVrata);
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
    }

    @Override
    public String toString() {
        return super.toString()+" Broj vrata"+BrojVrata;
    }

    @Override
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        super.setGodinaProizvodnje(godinaProizvodnje);
    }

    @Override
    public int getGodProizvodnje() {
        return super.getGodProizvodnje();
    }
}
