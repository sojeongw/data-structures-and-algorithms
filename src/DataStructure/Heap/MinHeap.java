package DataStructure.Heap;

import java.util.ArrayList;
import java.util.List;

/* MinHeap
* 현재 노드가 부모 노드보다 크거나 같고, 자식 노드보다 작거나 같은 Heap
* */
public class MinHeap implements Heap {
    private final List<HeapElement> minHeap;

    // Constructor
    public MinHeap(List<HeapElement> listElements) {
        minHeap = new ArrayList<>();

        for(HeapElement heapElement : listElements){
            if(heapElement != null){
                insertElement(heapElement);
            }else{
                System.out.println("null이 입력되어 heap에 추가하지 않았습니다.");
            }
        }

        if(minHeap.size() == 0) System.out.println("element를 추가하지 않아 heap이 비어있습니다.");
    }

    /* 부모의 인덱스 = (자식의 인덱스) / 2
     * 왼쪽 자식의 인덱스 = (부모의 인덱스) * 2
     * 오른쪽 자식의 인덱스 = (부모의 인덱스) * 2 + 1
     * */

    // 해당 key가 부모의 key보다 작으면 값을 위로 올린다.
    private void toggleUp(int idx){
        double key = minHeap.get(idx -1).getKey();

        while (getElementKey((int) Math.floor(idx/2)) > key) {
            swap(idx, (int)Math.floor(idx/2));
            idx = (int)Math.floor(idx/2);
        }
    }

    // 해당 key가 자식보다 크면 아래로 내린다.
    private void toggleDown(int idx){
        double key = minHeap.get(idx - 1).getKey();
        // 현재 key가 자식보다 크거나, 맨 마지막 key보다 크다면 true
        boolean wrongOrder = (key > getElementKey(idx*2) || (key > getElementKey(Math.min(idx * 2, minHeap.size()))));

        // 자식의 key가 맨 마지막이거나 그 보다 작고, 잘못된 순서로 되어있을 때
        while((2*idx <= minHeap.size()) && wrongOrder){
            // 왼쪽 자식이 마지막이 아니면서 오른쪽 자식이 왼쪽 자식보다 key가 작을 때
            if((2*idx < minHeap.size()) && (getElementKey(idx*2 + 1) < getElementKey(idx*2))){
               // 오른쪽 자식과 바꾼다.
                swap(idx, 2*idx + 1);
                idx = 2*idx + 1;
            }else{
                // 아니면 왼쪽 자식과 바꾼다.
                swap(idx, 2*idx);
                idx = 2*idx;
            }
            // 현재 key가 왼쪽 자식이나 마지막 자식보다 크다면 true
            wrongOrder = (key > getElementKey(idx*2)) || (key > getElementKey(Math.min(idx*2, minHeap.size())));
        }

    }

    // 해당 index에 맞는 값을 가져온다. 이때 list인 meanHeap의 키는 index -1 이다.
    public HeapElement getElement(int idx){
        if((idx <= 0) || idx > minHeap.size()){
            throw new IndexOutOfBoundsException("인덱스가 heap의 범위를 벗어났습니다.");
        }
        return minHeap.get(idx - 1);
    }

    // 해당 index에 맞는 키를 가져온다.
    private double getElementKey(int idx){
        return minHeap.get(idx - 1).getKey();
    }

    // 힙의 두 값을 서로 swap 한다.
    private void swap(int idx1, int idx2){
        HeapElement tmpHeap = minHeap.get(idx1 - 1);

        minHeap.set(idx1 - 1, minHeap.get(idx2 - 1));
        minHeap.set(idx2 - 1, tmpHeap);
    }

    @Override
    public HeapElement getElement() throws EmptyHeapException {
        try {
            return extractMin();
        } catch (Exception e) {
            throw new EmptyHeapException("Heap is empty. Error retrieving element");
        }
    }

    // 최소 heap을 추출한다 = key가 0인 값을 불러온다.
    private HeapElement extractMin() {
        HeapElement result = minHeap.get(0);
        deleteElement(0);
        return result;
    }

    // heap에 값을 insert 한다.
    @Override
    public void insertElement(HeapElement element) {
        minHeap.add(element);
        // 맨 마지막 값을 위로 올린다.
        toggleUp(minHeap.size());
    }


    // heap에 있는 값을 delete 한다.
    @Override
    public void deleteElement(int idx) {
        // list가 비어있다면 예외처리한다.
        if(minHeap.isEmpty()){
            try{
                throw new EmptyHeapException("비어있는 heap입니다.");
            }catch (EmptyHeapException e){
                e.printStackTrace();
            }
        }
        // index가 list 사이즈보다 크거나 0보다 작다면 range를 벗어났다고 예외처리 한다.
        if ((idx > minHeap.size()) || idx <= 0) {
            throw new IndexOutOfBoundsException("heap의 범위를 벗어났습니다.");
        }

        // 지워질 자리에 마지막 원소의 값을 채워넣는다.
        minHeap.set(idx-1, getElement(minHeap.size()));

        // 마지막 원소는 지운다.
        minHeap.remove(minHeap.size());

        // 지워질 값의 key가 부모의 key보다 작다면
        if(getElementKey(idx) < getElementKey((int)Math.floor(idx/2))){
            // 위로 올린다.
            toggleUp(idx);
        // 왼쪽 자식이 맨 마지막보다 작거나 같고 지금 key가 왼쪽 자식보다 크거나, 왼쪽 자식이 맨 마지막보다 작고 지금 key가 왼쪽보다 크다면
        }else if(((2 * idx <= minHeap.size()) && (getElementKey(idx) > getElementKey(idx * 2))) || ((2 * idx < minHeap.size()) && (getElementKey(idx) > getElementKey(idx * 2)))) {
            // 아래로 내린다.
            toggleDown(idx);
        }
    }
}
