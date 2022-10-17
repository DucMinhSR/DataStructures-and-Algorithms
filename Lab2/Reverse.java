public class Reverse {
     public static void reverse(StringBuffer str){
          MyStack<Character> obj = new MyStack<Character>();
          for(int i = 0;i<str.length();i++){
               obj.push(str.charAt(i));
          }
          for(int i=0;i<str.length();i++){
               Character temp = obj.pop();
               str.setCharAt(i,temp);
          }
     }
     public static void main(String args[]){
          StringBuffer string = new StringBuffer("NTTV");
          reverse(string);
          System.out.print("String reverse:"+string);
     }
}
