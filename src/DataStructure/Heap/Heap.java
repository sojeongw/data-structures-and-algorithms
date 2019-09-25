package DataStructure.Heap;

/* Heap
 * 힙은 특정한 방법으로 데이터를 저장하는 tree 모양의 자료구조다.
 * 각각의 노드는 데이터 하나와 일치하고 하나의 부모와 최대 두 개의 자식 노드를 가진다. (루트의 경우 부모 노드 제외)
 * 각각의 요소는 키를 가지고 있는데 이 키가 트리의 모양을 암시한다.
 * 예를 들어 최소 힙의 키는 부모보다 크거나 같고, 자식보다 작거나 같다. (최대 힙은 그 반대)
 * 힙과 관련있는 모든 연산(insert, delete, 최소/최대값 추출)은 O(log n)이 걸린다.
 */
public interface Heap {
    /**
     * @return 최소 힙이라면 가장 작은 키를, 최대 힙이라면 가장 큰 키를 반환한다.
     * @throws EmptyHeapException 힙이 비어있다면 예외가 발생한다.
    */
    HeapElement getElement() throws EmptyHeapException;

    /**
     * 힙에 데이터를 추가한다.
     * 계속 자리를 바꾸며 적절한 위치를 찾아간다.
     * @param element 객체의 인스턴스
     */
    void insertElement(HeapElement element);

    /**
     * 힙에 있는 데이터를 삭제한다.
     * @param elementIndex 힙에서 지워질 데이터의 인덱스
     */
    void deleteElement(int elementIndex);
}