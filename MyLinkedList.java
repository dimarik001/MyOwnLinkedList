
package myownlinkedlist;

public class MyLinkedList {
    private int size;
    private Node head;

    public MyLinkedList() {
        head= new Node();
        //Hranim priznak golovi
        head.setElement(-1);
        size = 0;
    }

    public Node getHead() {
        return head;
    }

      public void addAfter(Node one, Node two){
          one.setNext(two);
          size++;
    }
}
