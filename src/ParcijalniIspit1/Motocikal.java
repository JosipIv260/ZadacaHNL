package ParcijalniIspit1;

public class Motocikal extends Vozilo {
    private String TipMotocikla;
    public Motocikal(String regBroj, String marka, int godProizvodnje,String tipMotocikla) {
        super(regBroj, marka, godProizvodnje);
        this.TipMotocikla=tipMotocikla;
    }

    @Override
    public String ucitajPodatke() {
        return super.ucitajPodatke()+" Tip motocikla: "+TipMotocikla;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
    }
    public void  TipMotocikla(){
        System.out.println("tip motocikla je: "+TipMotocikla);
    }

    @Override
    public String toString() {
        return super.toString()+" Tip motocikla"+TipMotocikla;
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
