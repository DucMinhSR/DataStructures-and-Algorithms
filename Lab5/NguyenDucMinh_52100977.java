import java.util.*;
public class NguyenDucMinh_52100977{
     public static boolean StackPalindrome(int n) {
          Stack<Integer> stack = new Stack<Integer>();
          Queue<Integer> queue = new LinkedList<Integer>();
          while(n !=0){
               stack.push(n%10);
               queue.add(n%10);
               n /= 10;
          }
          while(!stack.isEmpty()){
               if(stack.pop() != queue.poll()){
                    return false;
               }
          }
          return true;
     }
     public static void main(String args[]){
          System.out.println(StackPalindrome(15321));
          System.out.println(StackPalindrome(123321));
     }
}
