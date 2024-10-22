public class MyHashSet {

    private final int CAPACITY = 1_000_001;
    private final boolean[] content;

    public MyHashSet() {
        content = new boolean[CAPACITY];
    }

    public void add(int key) {
        content[key] = true;
    }

    public void remove(int key) {
        content[key] = false;
    }

    public boolean contains(int key) {
        return content[key];
    }

}