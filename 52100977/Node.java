public class Node <E>{
     private int data;
     private Node<E> next;
     public Node(int data,Node<E> next){
          this.data = data;
          this.next = next;
     }
     public Node(){
          this.data = 0;
          this.next = null;
     }
     public int getData(){
          return this.data;
     }
     public void setNext(Node<E> node){
          this.next = node;
     }
     public Node getNext(){
          return next;
     }
}
