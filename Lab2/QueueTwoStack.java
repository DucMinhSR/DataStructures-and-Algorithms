public class QueueTwoStack<E>{
     MyStack<Integer> stack1 = new MyStack<Integer>();
     MyStack<Integer> stack2 = new MyStack<Integer>();
     public void enQueue(int x){
          while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
          }
          stack1.push(x);
          while(!stack2.isEmpty()){
               stack1.push(stack2.pop());
          }
     }
     public int deQueue(){
          if(stack1.isEmpty()){
               System.out.println("Q is Empty");
               return 0;
          }
          int x = stack1.getPeek();//xem du lieu tk tren cung
          stack1.pop();
          return x;
     }
}
