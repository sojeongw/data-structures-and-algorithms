package DataStructure.Heap;

public class HeapElement {
    private final double key;
    private final Object info;

    // Constructors
    public HeapElement(double key, Object info) {
        this.key = key;
        this.info = info;
    }

    public HeapElement(int key, Object info) {
        this.key = key;
        this.info = info;
    }

    public HeapElement(Integer key, Object info) {
        this.key = key;
        this.info = info;
    }
    public HeapElement(Double key, Object info) {
        this.key = key;
        this.info = info;
    }

    public HeapElement(double key) {
        this.key = key;
        this.info = null;
    }

    public HeapElement(int key) {
        this.key = key;
        this.info = null;
    }

    public HeapElement(Integer key) {
        this.key = key;
        this.info = null;
    }

    public HeapElement(Double key) {
        this.key = key;
        this.info = null;
    }

    // Getters
    public double getKey() {
        return key;
    }

    public Object getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "HeapElement{" +
                "key=" + key +
                ", info=" + info +
                '}';
    }

    /**
     * @param otherHeapElement
     * @return true key와 info가 동일하면 true를 리턴한다.
     */
    public boolean equals(HeapElement otherHeapElement) {
        return (this.key == otherHeapElement.key) && (this.info.equals(otherHeapElement.info));
    }
}
