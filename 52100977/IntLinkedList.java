public class IntLinkedList<Integer>{
     Node<Integer> head;
     public IntLinkedList(){
          head = null;
     }
     public void addFirst(int data){
          head = new Node<Integer>(data,head);
     }
     public boolean addLast(int data){
          while(head!=null){
               if(head.getData() == data){
                    return false;
               }
               head = head.getNext();
          }
          if(head == null){
               addFirst(data);
               return true;
          }
               
          Node<Integer> currNode = head;
          while(currNode.getNext() != null){
               currNode = currNode.getNext();
          }
          currNode.setNext(new Node<>(data, null));
          return true;
     }
     public boolean removeAt(int position){
          if (head == null) {
               return false;
           }
           if (position < 1 || position >= countNode() ) {
               return false;
           }
           if (position == 1) {
               head = head.getNext();
               return true;
           }
           Node preNode = null;
           Node currNode = head;
           for (int i = 0; i < position; i++) {
               preNode = currNode;
               currNode = currNode.getNext();
           }
          preNode.setNext(currNode.getNext());
           return true;


     }
     public int countOdd(){
          int count =0;
          while(head!= null){
               if(head.getData() %2 ==1){
                    count ++;
               }
               head = head.getNext();
          }
          return count;

     }
     public int searchKey(int key){
          if(head == null){
               return -1;
          }
          int  i =0;
          Node<Integer> temp = head;
          while(temp !=null){
               i++;
               if(temp.getData()==key){
                    return i;
               }
               temp =  temp.getNext();
          }
          return -1;

     }
     public  boolean checkSorted(){
          int t1, t2 = 0;
          Node tmp = head.getNext();
          Node preNode = head;
          while (tmp != null) {
              t1 = t2;
              t2 = tmp.getData() - preNode.getData();
              if (t1 * t2 < 0) return false;
              preNode = tmp;
              tmp = tmp.getNext();
          }
          return true;
     }
     public int countNode(){
          int count = 0;
          while(head!= null){
               count ++;
               head= head.getNext();
          }
          return count;
     }
}