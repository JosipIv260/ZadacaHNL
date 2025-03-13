package VjezbaSveDoSad;
import java.util.ArrayList;
import java.util.List;
public class DrugiZad {
    public static void main(String[] args) {

        String[] J = {
                "     J",
                "     J",
                "     J",
                "J    J",
                " JJJJ "
        };

        String[] A = {
                "   A   ",
                "  A A  ",
                " A   A ",
                " AAAAA ",
                " A   A "
        };

        String[] V = {
                "V     V",
                " V   V ",
                "  V V  ",
                "   V   ",
                "   V   "
        };


        String[][] javaName = {J, A, V, A};


        for (int i = 0; i < V.length; i++) {
            for (String[] letter : javaName) {
                System.out.print(letter[i]);
            }
            System.out.println();
        }
    }
}
