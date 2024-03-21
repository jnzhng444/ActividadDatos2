
import cr.ac.tec.Lista;
import cr.ac.tec.TraverseDirection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 2 InsertarLista
        Lista<Integer> List = new Lista<>();
        Lista<Integer> ListToInsert = new Lista<>();

        List.insertLast(1);
        List.insertLast(2);
        List.insertLast(3);
        List.insertLast(4);

        ListToInsert.insertLast(5);
        ListToInsert.insertLast(6);
        ListToInsert.insertLast(7);
        ListToInsert.insertLast(8);

        System.out.println("Lista Original:");
        List.print(TraverseDirection.FORWARD);
        System.out.println("");
        System.out.println("\nLista con nueva lista insertada:");
        List.insertarLista(ListToInsert);
        List.print(TraverseDirection.FORWARD);
        System.out.println("");

        //Ejercicio 3 Sub Lista
        Lista<Integer> SubList = List.subLista(2, 5);
        System.out.println("\nLa sub lista es:");
        SubList.print(TraverseDirection.FORWARD);
        System.out.println("");

        //Ejercicio 4 Invertir Lista
        List.invertir();
        System.out.println("\nLa Lista invertida es:");
        List.print(TraverseDirection.FORWARD);
    }
}