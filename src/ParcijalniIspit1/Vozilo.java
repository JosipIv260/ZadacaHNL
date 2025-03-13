package ParcijalniIspit1;
import java.io.*;
abstract public class Vozilo {
    private String RegBroj;
    private String Marka;
    private int GodProizvodnje;
public Vozilo(String regBroj,String marka,int godProizvodnje){
    if (GodProizvodnje < 0) {
        throw new IllegalArgumentException("Godina proizvodnje ne može biti negativna.");
    }
    this.RegBroj=regBroj;
    this.GodProizvodnje=godProizvodnje;
    this.Marka=marka;
}
public String ucitajPodatke(){
    return "Marka :"+Marka+" Registarska oznaka: "+RegBroj+" Godina proizvodnje: "+GodProizvodnje;
}
public void prikaziPodatke(){
    System.out.println("Marka vozila je "+Marka+" Registarski broj je "+RegBroj+" Godina proizvodnje je "+GodProizvodnje);
}

    @Override
    public String toString() {
        return "Registarski broj "+RegBroj+" Marka "+Marka+" Godina proizvodnje "+GodProizvodnje;
    }
    public void setGodinaProizvodnje(int godinaProizvodnje) {
        if (godinaProizvodnje < 0) {
            throw new IllegalArgumentException("Godina proizvodnje ne može biti negativna.");
        }
        this.GodProizvodnje = godinaProizvodnje;
    }

    public int getGodProizvodnje() {
        return GodProizvodnje;
    }
}
