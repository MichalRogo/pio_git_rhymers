package edu.kis.vh.nursery.list;

/**
 * klasa publiczna reprezentująca Listę powiązaną przechowującą dane typu int.
 * Pozwala na dodawanie, usuwanie i sprawdzanie stanu elementów na końcu listy.
 */
public class IntLinkedList {

    public static final int DEFAULT_RETURN = -1;
    Node last;
    int i;

    /**
     *  Funkcja dodaje wartość i na koniec listy.
     *  Jeśli lista jest pusta, tworzy pierwszy element.
     * @param i - element który ma zostać dodany do listy.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Funkcja sprawdza czy lista jest pusta.
     * @return - true jeśli lista jest pusta, w przeciwnym razie false.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Lista nie ma limitu rozmiaru.
     * @return - zawsze zwraca false.
     * TODO - Remove method - W obecnej implementacji metoda nie ma sensu.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * funkcja zwraca wartość ostatniego dodanego do listy elementu.
     * jeśli lista jest pusta, zwraca DEFAULT_RETURN
     * @return - DEFAULT_RETURN jeśli pusta/last.value jeśli nie
     */
    public int top() {
        if (isEmpty())return DEFAULT_RETURN;
        return last.getValue();
    }

    /**
     * Jeśli lista jest pusta, funkcja zwraca DEFAULT_RETURN.
     * W przeciwnym razie usuwa ostatni element z listy i zwraca jego wartość
     * TODO - add exception - poinformowanie użytkownika o próbie usunięcia nieistniejącego elementu
     * @return - DEFAULT_RETURN jeśli lista jest pusta/wartość usuniętego elementu jeśli nie
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
