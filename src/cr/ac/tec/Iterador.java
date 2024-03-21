package cr.ac.tec;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterador<T> implements Iterable<T> {
    private Nodo<T> head;
    private int size;

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public Iterador() {
        this.head = null;
        this.size = 0;
    }

    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo<T> actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<T> {
        private Nodo<T> actual;

        public IteradorLista() {
            this.actual = head;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Iterador<Integer> lista = new Iterador<>();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);


        System.out.println("Elementos de la lista:");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }
}
