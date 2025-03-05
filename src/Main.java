import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisi Stop ako je unso gotov ako ne Nastavi");
        String a1= sc.nextLine();
        List<String>Utaknice=new ArrayList<>();
        List<String>Klubovi=new ArrayList<>();
        List<String>Tekst=new ArrayList<>();
        List<String>Strijelci=new ArrayList<>();
        List<String>Teren2=new ArrayList<>();
        List<Integer>Golovi2=new ArrayList<>();
        int brojutaknice=0;
        int KlubID=0;
        while (true) {
            if (a1.equals("Stop")) {
                break;}else
            {
                brojutaknice++;
                String broj=Integer.toString(brojutaknice);
                Utaknice.add(broj);
                for (int i = 0; i < 2; i++){
                    System.out.println("Upisi Grad iz kojeg klub dolazi,rezultat,ime kluba,da li je domacin ili gost");
                    String Grad = sc.nextLine();
                    int Rezultat = sc.nextInt();
                    sc.nextLine();
                    Golovi2.add(Rezultat);
                    String Imekluba=sc.nextLine();
                    KlubID+=1;
                    Klubovi.add(Imekluba);
                    Utaknice.add(Imekluba);
                    String Teren = sc.nextLine();
                    Teren2.add(Teren);
                    Klub2 klub=new Klub2(Grad,Rezultat,Imekluba,KlubID,Teren);
                    System.out.println("Upiši ime trenera,prezime i godine iskustva,");
                    String ImeTrenera = sc.nextLine();
                    String PrezimeTrenera = sc.nextLine();
                    int GodIsk = sc.nextInt();
                    sc.nextLine();
                    Klub2 trener=new Klub2(ImeTrenera,PrezimeTrenera,GodIsk);
                    Tekst.add(trener.toString());
                    if (Rezultat>0){
                        for (int a=0; a<Rezultat;a++){
                            System.out.println("Upiši broj dresa,velicinu kopacke,ime,prezime");
                            int dres=sc.nextInt();
                            sc.nextLine();
                            int kopacka=sc.nextInt();
                            sc.nextLine();
                            String ime=sc.nextLine();
                            String prezime=sc.nextLine();
                            Klub3 igrači=new Klub3(dres,kopacka,ime,prezime);
                            Strijelci.add(igrači.toString());
                        }}
                }
            } System.out.println("Upisi Stop ako je unos gotov, ako ne Nastavi");
            a1 =sc.nextLine();
        }
        int Golovi=0;
        int teren=0;
        int Strijelci2=0;
        for (int c=0;c<2;c++) {
            System.out.println(Klubovi.get(Golovi) + "\t" + Golovi2.get(Golovi) + " VS " + Klubovi.get(Golovi+1) + "\t" + Golovi2.get(Golovi + 1));
            for (int i=0; i<2;i++) {

                teren++;
                System.out.println("Teren " + Teren2.get(teren - 1));
                System.out.println(Tekst.get(teren-1));
                for (int b = 0; b < Golovi2.get(Golovi); b++) {
                    System.out.println(Strijelci.get(Strijelci2));
                    Strijelci2++;
                }
                Golovi++;
            }
            System.out.println("-------------------------");
        }
    }
}