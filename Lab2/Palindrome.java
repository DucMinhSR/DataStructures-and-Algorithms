public class Palindrome {
     public static boolean checkPalindrome(String item) {
          MyStack<Character> newStack = new MyStack<Character>();
          MyQueue<Character> newQueue = new MyQueue<Character>();
          char[] temp = item.toCharArray();
          for (int i = 0; i < temp.length; i++) {
              if(Character.isLetter(temp[i])) {
                  newStack.push(Character.toLowerCase(temp[i]));
                  newQueue.enQueue(Character.toLowerCase((temp[i])));
              }
          }
  
          while (!newStack.isEmpty()) {
              if (newStack.pop().equals(newQueue.deQueue())) {
                  return true;
              }
          }
          return false;
      }
  
      public static void main(String[] args) {
          System.out.println(checkPalindrome("dad"));
          System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
          System.out.println(checkPalindrome("hello"));
          
        }
}
