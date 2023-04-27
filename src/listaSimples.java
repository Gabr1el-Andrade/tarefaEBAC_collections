import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listaSimples {

    public static void main(String[] args) {
System.out.println("***Lista oredanda***" );
        List<String> lista = new ArrayList<>();
        lista.add("Lucas");
        lista.add("joão");
        lista.add("Ana");
        lista.add("Débora");
        lista.add("Pedro");
        lista.add("Lucia");
        Collections.sort(lista);
                System.out.println(lista);
    }
}





