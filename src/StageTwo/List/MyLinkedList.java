package StageTwo.List;

import java.util.*;

/**
 * Tutorial class with a simple ArrayList implementation
 *
 * @author Irina Zaitceva
 */
public class MyLinkedList<E> extends AbstractSequentialList<E> {
    /**
     * The size of the MyLinkedListList (the number of elements it contains).
     */
    private int size;

    /**
     * Pointer to first node.
     */
    Node<E> first;

    /**
     * Pointer to last node.
     */
    Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {
        size = 0;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}