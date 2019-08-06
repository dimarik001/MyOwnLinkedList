
package myownlinkedlist;

public class Node {
    
    private int element;
    private Node next;

    Node() {
    }
    
    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
