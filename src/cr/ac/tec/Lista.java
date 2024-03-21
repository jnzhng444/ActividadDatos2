package cr.ac.tec;


import java.util.Optional;

public class Lista<T> {
    private Nodo<T> head = null;
    private Nodo<T> tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Insert at beginning
     */
    public void insert(T element) {
        Nodo<T> nuevo = new Nodo<T>(element);
        if (isEmpty()) {
            head = nuevo;
            tail = head;
        } else {
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
        }
    }

    public void insertLast(T element) {
        if (isEmpty()) {
            this.insert(element);
        } else {
            Nodo<T> nuevo = new Nodo<T>(element);
            tail.next = nuevo;
            nuevo.prev = tail;
            tail = nuevo;
        }
    }

    // Insertar lista (Ejercicio 2)
    public void insertarLista(Lista<T> element) {
        if (element.isEmpty()) {
            return;
        }

        if (isEmpty()) {
            head = element.head;
            tail = element.tail;
        } else {
            tail.next = element.head;
            element.head.prev = tail;
            tail = element.tail;
        }
    }

    //Crear sub lista (Ejercicio 3)
    public Lista<T> subLista(int inicio, int tamaño) {
        Lista<T> subLista = new Lista<>();
        Nodo<T> current = head;
        int contador = 0;

        while (contador < inicio && current != null) {
            current = current.next;
            contador++;
        }

        if (current == null) {
            return subLista;
        }

        contador = 0;
        while (contador < tamaño && current != null) {
            subLista.insertLast(current.valor);
            current = current.next;
            contador++;
        }

        return subLista;
    }


    //Invertir lista (Ejercicio 4)
    public void invertir() {
        if (isEmpty() || head == tail) {
            return;
        }
        Nodo<T> current = head;
        Nodo<T> prevNode = null;

        while (current != null) {
            Nodo<T> nextNode = current.next;
            current.next = prevNode;
            current.prev = nextNode;
            prevNode = current;
            current = nextNode;
        }

        Nodo<T> aux = head;
        head = tail;
        tail = aux;
    }

    public void print(TraverseDirection direction) {
        if (direction == TraverseDirection.BACKWARD) {
            Nodo<T> current = tail;
            while (current != null) {
                System.out.print(current.valor + " ");
                current = current.prev;
            }
        } else {
            Nodo<T> current = head;
            while (current != null) {
                System.out.print(current.valor + " ");
                current = current.next;
            }
        }
    }
    public Optional<T> getHead() {
        if (head != null) {
            return Optional.of(head.valor);
        } else {
            return Optional.empty();
        }
    }

    public Optional<T> getTail() {
        if (tail != null) {
            return Optional.of(tail.valor);
        } else {
            return Optional.empty();
        }
    }
}
