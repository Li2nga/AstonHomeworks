package StageTwo.List;

import java.util.*;

/**
 * Tutorial class with a simple ArrayList implementation
 *
 * @author Irina Zaitceva
 */
public class MyArrayList<E> extends AbstractList<E> {
    /**
     * The size of the ArrayList (the number of elements it contains).
     */
    private int size;
    /**
     * The array buffer into which the elements of the ArrayList are stored.
     * initial capacity is 10. Expand by 10 when it's crowded
     * collapses by 10 if 20 elements are missing
     */
    private Object[] elementData;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        this.size = 0;
        this.elementData = new Object[10];
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(E e) {
        if (elementData.length == size) {
            elementData = Arrays.copyOf(elementData, size + 10);
        }
        elementData[size++] = e;
        return true;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}