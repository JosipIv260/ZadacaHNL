package VjezbaSveDoSad;
import java.util.List;
import java.util.ArrayList;

public class GlavniPolaznik {
    public static void main(String[] args) {
        List<Integer>lista=new ArrayList<>();
        Polazink prvi=new Polazink(23,"Marko","Miskic");
        Polazink drugi=new Polazink(25,"Ivan","Zajc");
        Polazink treci=new Polazink(34,"Dante","Miric");

        int max=Math.max(Math.max(prvi.getDob(), drugi.getDob()), treci.getDob());
        int min=Math.min(Math.min(prvi.getDob(),drugi.getDob()), treci.getDob());
        System.out.println(max);

    }

}
