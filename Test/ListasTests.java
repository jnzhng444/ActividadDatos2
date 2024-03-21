import cr.ac.tec.Lista;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ListasTests {
    private Lista<Integer> list;

    @Before
    public void setUp() {
        list = new Lista<>();
    }

    //Test 1 Insertar Listas
    @Test
    public void test1InsertarLista() {
        Lista<Integer> listToInsert = new Lista<>();
        //Primer test
        listToInsert.insertLast(3);
        listToInsert.insertLast(4);
        list.insertLast(2);
        list.insertarLista(listToInsert);
        assertEquals(Optional.of(4), list.getTail());
        assertEquals(Optional.of(2), list.getHead());
    }

    //Test 2 Insertar Listas
    @Test
    public void test2InsertarLista() {
        Lista<Integer> listToInsert = new Lista<>();
        //Primer test
        listToInsert.insertLast(3);
        listToInsert.insertLast(4);
        listToInsert.insertLast(5);
        listToInsert.insertLast(6);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertarLista(listToInsert);
        assertEquals(Optional.of(6), list.getTail());
        assertEquals(Optional.of(0), list.getHead());
    }

    //Test 3 Insertar Listas
    @Test
    public void test3InsertarLista() {
        Lista<Integer> listToInsert = new Lista<>();
        listToInsert.insertLast(3);
        listToInsert.insertLast(4);
        listToInsert.insertLast(5);
        listToInsert.insertLast(6);
        listToInsert.insertLast(7);
        list.insertLast(0);
        list.insertLast(1);
        list.insertarLista(listToInsert);
        assertEquals(Optional.of(7), list.getTail());
        assertEquals(Optional.of(0), list.getHead());
    }
    //*******************************************************
    // Test1 Sub Listas
    @Test
    public void test1SubLista() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        Lista<Integer> subList = list.subLista(2, 3);
        assertEquals(Optional.of(7), subList.getHead());
        assertEquals(Optional.of(4), subList.getTail());
    }
    // Test2 Sub Listas
    @Test
    public void test2SubLista() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.insert(7);
        Lista<Integer> subList = list.subLista(0, 4);
        assertEquals(Optional.of(7), subList.getHead());
        assertEquals(Optional.of(3), subList.getTail());
    }@Test
    //test3 sub listas
    public void test3SubLista() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        Lista<Integer> subList = list.subLista(3, 5);
        assertEquals(Optional.of(6), subList.getHead());
        assertEquals(Optional.of(1), subList.getTail());
    }
    //************************************************************
    //Test 1 Invertir Listas
    @Test
    public void test1Invertir() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.invertir();
        assertEquals(Optional.of(1), list.getHead());
        assertEquals(Optional.of(3), list.getTail());
    }

    //Test 2 Invertir Listas
    @Test
    public void test2Invertir() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.invertir();
        assertEquals(Optional.of(1), list.getHead());
        assertEquals(Optional.of(5), list.getTail());
    }

    //Test 3 Invertir Listas
    @Test
    public void test3Invertir() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.invertir();
        assertEquals(Optional.of(1), list.getHead());
        assertEquals(Optional.of(4), list.getTail());
    }

}