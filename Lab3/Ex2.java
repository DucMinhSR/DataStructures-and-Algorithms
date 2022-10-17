public class Ex2{
     private  static int count =0 ;
     public static int factorial(int n){
          if(n==0){
               return 1;
          }
          return n*factorial(n-1);
     }

     public static  int powerX(int n, int x){
          if (n==1){
               return x;
          }else{
               return powerX(n-1,x)*x;
          }
     }
     public static int countDigits(int n){
          if(n<=0){
               return count;
          }
          count++;
          return countDigits(n/10);
     }
     public static int findGCD(int a , int b){
          if(a==b){
               return a;
          }else if(a>b){
               return findGCD(a-b,b);
          }
          return findGCD(a,b-a);
     }
     public static void main(String[] args){
          System.out.println(factorial(3));
          System.out.println(powerX(3, 3));
          System.out.println(countDigits(12345));
          System.out.println(findGCD(8,12));
     }
     
}