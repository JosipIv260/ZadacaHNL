package VjezbaIznimke;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Iznimke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int broj=5;
        int broj2=1;
//        try {System.out.println("unesite broj");
//            int broj3=sc.nextInt();
//            for (int i=1;i<=broj3;i++){
//                int faktorijel=i*broj2;
//                broj2=i*broj2;
//
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Greška: Neispravan format broja.");}
//        catch (OutOfMemoryError e) {
//            System.out.println("Greška: Nema dovoljno memorije.");
//        }

        // Faktorijal tog broja racunanje
//        for (int i=1;i<=broj3;i++){
//            int faktorijel=i*broj2;
//            broj2=i*broj2;

//        }
//        System.out.println("Faktorijel: "+broj2);


        try {
            System.out.println("Unesite broj: ");
            int broj3 = sc.nextInt();
            for (int i = 1; i <= broj3; i++) {
                int faktorijel = i * broj2;
                broj2 = faktorijel;
                System.out.println("Faktorijel od " + i + " je " + faktorijel);
            }
        } catch (InputMismatchException e) {
            System.out.println("Greška: Neispravan format broja. Molimo unesite cijeli broj.");
        } catch (Exception e) {
            System.out.println("Dogodila se neočekivana greška: " + e.getMessage());
        }catch (OutOfMemoryError e) {
            System.out.println("Greška: Nema dovoljno memorije.");
        }finally {
            sc.close();
        }


    }

}
