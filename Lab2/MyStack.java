import java.util.NoSuchElementException;

public class MyStack<E> implements StackInterface<E> {
     private Node<E> top ;
     private int numNode;
     public MyStack(){
          this.top = null;
          this.numNode = 0;
     }
     public void push(E item){
          this.top = new Node<E>(item,top);
          numNode++;

     }
     public E pop(){
          if(isEmpty()){
               return null;
          }
          return removeFirst();
     }
     public int size(){
          return numNode;
     }
     public boolean contains(E item){
          if(this.numNode==0){
               return false;
          }else{
               for(Node<E> i = top;i!=null;i =i.getNext()){
                    if(i.getData().equals(item)){
                         return true;
                    }
               }
          }
          return false;
     }
     public void print(){
          if(isEmpty()){
               System.out.println("StackEmpty");
          }else{

          }
     }
     public boolean isEmpty(){
          if(numNode==0){
               return true;
          }
          return false;
     }
     public E getPeek(){//lay data cua tk tren cung ma khong lay no ra
          return top.getData();
     }
     public E removeFirst(){
          if(top== null){
               throw new NoSuchElementException("Stack is empty");
          }else{
               Node<E> temp = top;
               top = top.getNext();
               numNode--;
               return temp.getData();
          }
     }
}
