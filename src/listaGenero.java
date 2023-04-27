import java.util.*;

public class listaGenero {
    public static void main(String[] args) {
String nomes = "joao-m,maria-f,lucas-m,ana-f,felipe-m,debora-f";
String separarNomes[]= nomes.split(",");
        System.out.println("*** Todos os nomes ***");
        System.out.println(nomes);
        System.out.println("*** Femininos ***");
        System.out.println(separarNomes[1]);
        System.out.println(separarNomes[3]);
        System.out.println(separarNomes[5]);
        System.out.println("*** Masculinos ***");

        System.out.println(separarNomes[0]);
        System.out.println(separarNomes[2]);
        System.out.println(separarNomes[4]);
    }
    }
