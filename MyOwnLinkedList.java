
package myownlinkedlist;

import com.sun.javafx.font.FontConstants;

public class MyOwnLinkedList {

    public static void main(String[] args) {
        
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        
        node1.setElement(1);
        node2.setElement(10);
        node3.setElement(112);
        node4.setElement(178);
        node5.setElement(81);
        
        MyLinkedList myLinkedList = new MyLinkedList();
        
       myLinkedList.addAfter(myLinkedList.getHead(), node1);
       myLinkedList.addAfter(node1, node2);
       myLinkedList.addAfter(node2, node3);
       Node temp = new Node();
       temp = myLinkedList.getHead();
       
       while(temp != null){
           System.out.println(temp.getElement());
           temp = temp.getNext();
       }
       
        System.out.println();
     }
}
