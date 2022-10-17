import java.security.NoSuchAlgorithmException;
import java.util.*;
public class MyLinkedList<E> implements ListInterface<E>{
     private Node<E> head = null;
     private int numNodes = 0;
     @Override
     public void addAfter(Node<E> current, E item ){
          if(current == null){
               addFirst(item);
          }else{
               Node<E> newNode = new Node<E>(item,current.getNext());
               current.setNext(newNode);
          }
          numNodes++;
     }
     @Override
     public void addFirst(E item){
          head = new Node<E>(item, head);
          numNodes++;
     }
     @Override
     public void addLast(E item){
          if(head == null){
               addFirst(item);
          }else{
               Node<E> temp = head;
               while(temp.getNext()!= null){
                    temp = temp.getNext();
               }
               Node<E> newNode= new Node<E>(item,null);
               temp.setNext(newNode);
               numNodes++;
          }

     }
     @Override
     public boolean contains (E item){
          Node<E> tmp = head;
          while(tmp!= null){
               if(tmp.getElement().equals(item)){
                    return true;
               }
               tmp = tmp.getNext();
          }
          return false;
     }
     @Override
    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an emtpy list");
        } else {
            return head.getElement();
        }
    }

    @Override
    public Node<E> getHead() {
        return head;
    }

    @Override
    public boolean isEmpty() {
        if (numNodes == 0)
            return true;
        return false;
    }
    
    public void print(){
          Node<E> tmp = head;
          if(head != null){
               System.out.print("List"+ tmp.getElement());
               tmp = tmp. getNext();
               while(tmp != null){
                    System.out.print("->"+tmp.getElement());
                    tmp = tmp.getNext();
               }
          }else{
               System.out.print("List is empty");
          }
    }
    @Override
    public E removeAfter(Node<E> current) throws NoSuchElementException{
          if(current == null){
               throw new NoSuchElementException("Can't remove element from an emty list");
          }else{
               Node<E> delNode = current.getNext();// del bi xoa
               if(delNode != null){
                    current.setNext(delNode.getNext());
                    numNodes -- ;
                    return delNode.getElement();
               }else{
                    throw new IllegalStateException("No next node to remove");
               }
               
          }
    }
    @Override
    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an emtpy list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNodes--;
            return tmp.getElement();
        }

    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an emtpy list");
        } else {
            Node<E> preNode = null;
            Node<E> delNode = head;
            while (delNode.getNext() != null) {
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            delNode.setNext(null);
            numNodes--;
            return delNode.getElement();
        }

    }

    @Override
    public int size() {
        return numNodes;
    }

    public E removeCurrent(Node<E> current){
          if(current == null){
               System.out.println("can't remove");
          }else{
               Node<E> preNode= null;
               Node<E> delNode = head;
               while(delNode!= null){
                    preNode = delNode;// pre chay theo cai del
                    if(delNode.getElement()== current.getElement()){
                         preNode.setNext(delNode.getNext());
                         numNodes --;
                         return delNode.getElement();
                    }
                    delNode = delNode.getNext();
               }
          } 
          return null;
    }

}
