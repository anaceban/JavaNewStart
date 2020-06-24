import number.A;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListByAna<E> {
    private Object[] elements;
    private int size;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_CAPACITY = 0;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTS = {};
    private static final Object[] EMPTY_ELEMENTDATA = {};
    protected transient int modCount = 0;

    public ArrayListByAna() {
        this.elements = (E[]) DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }

    public ArrayListByAna(E[] elements) {
        this.elements = elements;
    }

    public E[] getElements() {
        return (E[]) elements;
    }

    public int size() {
        this.size = elements.length;
        return size;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0)
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTS) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elements, minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elements.length > 0)
            grow(minCapacity);
    }

    private void fastRemove(int index) {
        size = size();
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index + 1, elements, index,
                    numMoved);
        elements[--size] = null; // clear to let GC do its work
    }

    public void trimToSize() {
        modCount++;
        if (size < elements.length) {
            elements = (size == 0)
                    ? EMPTY_ELEMENTDATA
                    : Arrays.copyOf(elements, size);
        }
    }


    public Object getElement(int index) {
        return elements[index];
    }

    public void add(E o, int index) {
        if (size < index + 1) {
            grow(index + 1);
        }
        elements[index] = o;
    }

    public boolean add(E o) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elements[size++] = o;
        return true;
    }

    public boolean remove(Object o) {
        size = size();
        for (int index = 0; index < size; index++)
            if (o.equals(elements[index])) {
                fastRemove(index);
                trimToSize();
                return true;
            }
            return false;
        }
    public E removeByIndex(int index) {
        modCount++;
        E oldValue = (E)elements[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index+1, elements, index,
                    numMoved);
        elements[--size] = null;
        trimToSize();
        return oldValue;
    }

        @Override
        public String toString () {
            final StringBuilder sb = new StringBuilder("ArrayListByAna{");
            sb.append("elements=").append(Arrays.toString(elements));
            sb.append('}');
            return sb.toString();
        }
    }
