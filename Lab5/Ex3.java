public class Ex3 {
     public static int maxDigits(int n){
          if(n==0){
               return 0;
          }
          return (Math.max(n%10,maxDigits(n/10)));
     }
     public static int search(int a[],int n, int key){
          if(n==0){
               return -1;
          }
          if(key==a [n-1]){
               return n-1;
          }
          return search(a,n-1,key);
     }
     public static void main(String[] args){
          int a[] = new int[]{3,2,5,6,2};
          System.out.println(search(a,5,3));
          System.out.println(maxDigits(2312));
     }
}
