package cr.ac.tec;


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

    public void insertarLista(Lista<T> element) {
        if (element.isEmpty()) {
            return; // Si la otra lista está vacía, no hay nada que insertar
        }

        if (isEmpty()) {
            // Si la lista original está vacía, simplemente establece su cabeza y cola como las de la otra lista
            head = element.head;
            tail = element.tail;
        } else {
            // Si la lista original no está vacía, conecta la cola de la lista original con la cabeza de la otra lista
            tail.next = element.head;
            element.head.prev = tail;
            // Actualiza la cola de la lista original como la cola de la otra lista
            tail = element.tail;
        }
    }

    public void invertir() {
        if (isEmpty() || head == tail) {
            return; // Si la lista está vacía o tiene solo un elemento, no hay nada que hacer
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

        // Al final, la cabeza (head) será lo que antes era la cola (tail) y viceversa
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
}
