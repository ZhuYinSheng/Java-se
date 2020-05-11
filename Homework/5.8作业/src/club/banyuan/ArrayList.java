package club.banyuan;

import java.lang.module.FindException;
import java.time.chrono.MinguoDate;

public class ArrayList implements List {
    private static final int DEFAULT_CAPACITY = 20;
    private int size;
    private int capacity;
    private Object[] data;

    @Override
    public Object set(int index, Object element) {
        if(isLegal(index))
            return null;
        Object temp = data[index];
        data[index] = element;
        return temp;
    }

    @Override
    public Object get(int index) {
        if(isLegal(index))
            return null;
        return data[index];
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public Object remove(int index) {
        if(isLegal(index))
            return null;
        Object temp = data[index];
        if(index == size-1){
            data[index] = null;
        } else {
            System.arraycopy(data, index+1, data, index, size-index);
        }
        size--;
        return temp;
    }

    @Override
    public boolean remove(Object o) {
        for(int i=0; i<size; i++){
            if(data[i] == null || data[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        addCapacity();
        data[size++] = o;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    private boolean isLegal(int index) {
        if (index >= size ) {
            System.out.println("下标不合法");
            return true;
        } else {
            return false;
        }
    }

    private void addCapacity(){
        if(data.length == size){
            capacity += DEFAULT_CAPACITY;
            Object[] newArray = new Object[capacity];
            System.arraycopy(data,0, newArray, 0, data.length);
            data = newArray;
        }
    }
}