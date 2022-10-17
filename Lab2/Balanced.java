public class Balanced {
     public static boolean balanced(String item) {
          MyStack<Character> newStack = new MyStack<Character>();
  
          for (int i = 0; i < item.length(); i++) {
              char temp = item.charAt(i);
              if (temp == '(' || temp == '[' || temp == '{') {
                  newStack.push(temp);
                  continue;
              }
              if (newStack.isEmpty()) {
                  return false;
              }
              char check;
              switch(temp) {
                  case ')':
                      check = newStack.pop();
                      if (check == '{' || check == '[') {
                          return false;
                      }
                      break;
                  
                  case '}':
                      check = newStack.pop();
                      if (check == '(' || check == '[') {
                          return false;
                      }
                      break;
  
                  case ']':
                      check = newStack.pop();
                      if (check == '(' || check == '{') {
                          return false;
                      }
                      break;
              }
          }
          return newStack.isEmpty();
      }
  
      public static void main(String[] args) {
          System.out.println(balanced("()"));
          System.out.println(balanced("()[]{}"));
          System.out.println(balanced("(]"));
          System.out.println(balanced("([)]"));
          System.out.println(balanced("{[]}"));
      } 
}
