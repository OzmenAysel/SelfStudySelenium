package dataStructure;

import java.util.*;

class RandomQueue<Item> implements Queue<Item> {
    private Item[] Q;
    private int N;
    // private int lastLoc;  // index of last element
    //private int startLoc = 9;
    public RandomQueue() {
        Q = (Item[]) new Object[2];
        N = 0;
        //  lastLoc = 0;
    }

    private void resize(int capacity) {
        Item[] item = (Item[]) new Object[capacity];
        for(int i = 0; i < N; i++) {
            item[i] = Q[i];
        }
        Q = item;
    }

    @Override
    public boolean add(Item item) {
        if(item == null) {
            throw new NullPointerException();
        }if( N == Q.length) {
            resize(2*Q.length);
        }
        Q[N++] = item;
        //   lastLoc = N;
        return false;

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Item remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        Random random= new Random();
        int randNum= random.nextInt(N);
        Item value= Q[randNum];
        if(randNum != N-1) {
            Q[randNum] = Q[N-1];
        }
        Q[N-1] = null;
        N--;
        if(N > 0 && N <= Q.length/4) {
            resize(Q.length/2);
        }
        return value;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Item> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean offer(Item item) {
        return false;
    }

    @Override
    public Item poll() {
        return null;
    }

    @Override
    public Item element() {
        return null;
    }

    @Override
    public String toString() {
        return "RandomQueue{" +
                "Q=" + Arrays.toString(Q) +
                ", N=" + N +
                +
                        '}';
    }
    @Override
    public Item peek() {
        return null;
    }
    public static void main(String[] args) {
        RandomQueue randomQueue=new RandomQueue();
        randomQueue.add(10);
        randomQueue.add(2);
        randomQueue.add(8);
        randomQueue.add(5);
        randomQueue.add(7);
        randomQueue.add(20);
        randomQueue.add(9);
        System.out.println(randomQueue);
        System.out.println(randomQueue.remove());
        System.out.println(randomQueue.remove());
        System.out.println(randomQueue.remove());
        System.out.println(randomQueue.remove());
    }
}
