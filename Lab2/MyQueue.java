import java.util.*;
public class MyQueue<E> implements QueueInterface<E> {
     private Node<E> front;
     private Node<E> rear;
     private int numNode;
     public MyQueue(){
          this.front = null;
          this.rear = null;
          this.numNode =0;
     }
     public void enQueue(E item){
          this.front = new Node<E>(item, front);
          numNode++;
     }
     public E removeFirst() throws NoSuchElementException{
          if(front == null){
               throw  new NoSuchElementException("Queue is Empty");
          }else{
               Node<E> temp = front;
               front = front.getNext();
               numNode--;
               return temp.getData();
          }
     }
     public E deQueue(){
          return removeFirst();
     }
     public int size(){
          return this.numNode;
     }
     public boolean contains(E item){
          if(numNode == 0){
               return false;
          }else{
               for(Node<E> i = front ;i!= null;i= i.getNext()){
                    if(i.getData().equals(item)){
                         return true;
                    }
               }
               return false;
          }
     }
     public void print(){
          if(isEmpty()){
               throw new NoSuchElementException("Queue Empty");
          }else{
               Node<E> temp = front;
               System.out.print("Queue:"+temp.getClass());
               for(int i =1;i< numNode;i++){
                    temp = temp.getNext();
                    System.out.print(","+ temp.getData());
               }
          }
     }
     public E getFront(){
          if(isEmpty()){
               return null;
          }else{
               return front.getData();
          }
     }
     public boolean isEmpty(){
          if(numNode==0){
               return true;
          }
          return false;
     }

}
