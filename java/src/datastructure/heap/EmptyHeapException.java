package datastructure.heap;

/**
 * 힙이 비어있을 때 get할 경우 예외 발생
 */
public class EmptyHeapException extends Exception{
    public EmptyHeapException(String message){
        super(message);
    }
}
