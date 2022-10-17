public class Ex1 {
     public static int factorial(int n){
          int fac = 1;
          for(int i =1 ;i<=n;i++){
               fac*=i;
          }
          return fac;
     }
     public static double powerX(int x, int n){
          return Math.pow(x,n);          
     }
     public static int countDigits(int n){
          int count =0;
          while(n>0){
               count++;
               n/=10;
          }
          return count;
     }
     public static boolean checkPrime(int n){
          if(n<2){
               return false;
          }
          for(int i=2;i<n;i++){
               if(n%i==0){
                    return false;
               }
          }
          return true;
     }
     public static int findGCD(int a, int b){
          int GCD = 0, min;
          if(a > b){
               min=b;
          }else{
               min =a;
          }
          for(int i =1;i<=a;i++){
               if(a % i ==0 && b%i==0){
                    GCD = i;
               }
          }  
          return GCD;
     }
     public static void main(String[] args){
          System.out.println(factorial(4));
          System.out.println(powerX(3,3));
          System.out.println(countDigits(12345));
          System.out.println(findGCD(4,12));

     }
}
