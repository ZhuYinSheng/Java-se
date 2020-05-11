package club.banyuan;

public class LinkedList implements List {

    private Node head = new Node();
    private Node tail = head;
    private int size;

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public Object get(int index) {
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }
        int count = index;
        Node cur = head;
        while (count != -1) {
            cur = cur.getNext();
            count--;
        }
        return cur.getData();
    }

    @Override
    public void clear() {
        this.head.setNext(null);
        this.tail = head;
        size = 0;
    }

    @Override
    public Object remove(int index) {
        if(isLegal(index))
            return null;
        Node cur = searchNode(index);
        removeNode(cur);
        size--;
        return cur.getData();
    }

    @Override
    public boolean remove(Object o) {
        Node cur = head;
        for(int i=0; i<size; i++){
            cur = cur.getNext();
            if(cur.getData() == null || cur.getData().equals(o)){
                removeNode(cur);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node();
        node.setData(o);
        node.setPrev(tail);
        tail.setNext(node);
        tail = node;
        size++;
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

    private boolean isLegal(int index){
        if (index >= size) {
            System.out.println("下标不合法");
            return true;
        } else {
            return false;
        }
    }

    private Node searchNode(int index){
        int count = index;
        Node cur = head;
        while (count != -1) {
            cur = cur.getNext();
            count--;
        }
        return cur;
    }

    private void removeNode(Node node) {
        if(node == tail){
            tail = node.getPrev();
            node.getPrev().setNext(null);
            node.setPrev(null);
        } else {
            node.getNext().setPrev(node.getPrev());
            node.getPrev().setNext(node.getNext());
            node.setPrev(null);
            node.setNext(null);
        }
    }
}