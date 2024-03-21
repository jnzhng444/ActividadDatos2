
import cr.ac.tec.Lista;
import cr.ac.tec.TraverseDirection;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 2 InsertarLista
        Lista<Integer> original = new Lista<>();
        Lista<Integer> porAnexar = new Lista<>();

        original.insertLast(1);
        original.insertLast(2);
        original.insertLast(3);
        original.insertLast(4);

        porAnexar.insertLast(5);
        porAnexar.insertLast(6);
        porAnexar.insertLast(7);
        porAnexar.insertLast(8);

        System.out.println("Original contiene: ");
        original.insertarLista(porAnexar);
        original.print(TraverseDirection.FORWARD);
        System.out.println(" ");
        System.out.println(" ");

        //Ejercicio 4 InvertirLista
        Lista<Integer> original2 = new Lista<>();
        original2.insertLast(1);
        original2.insertLast(2);
        original2.insertLast(3);
        original2.insertLast(4);

        original2.invertir();
        System.out.println("Lista invertida: ");
        original2.print(TraverseDirection.FORWARD);
    }
}