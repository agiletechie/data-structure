public class Node<T> {
    private T data;
    private Node<T> nextNode;

    Node(T data){
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
}
