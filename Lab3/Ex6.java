import java.util.*;
public class Ex6 {
     public static int findMin(int[] array, int size){
          int min = array[0];
          for(int i =0 ;i<size;i++){
               if(array[i]<min){
                    min = array[i];
               }
          }
          return min;
     }
     public static int sum(int[] array ,int size){
          int sum =0;
          for(int i =0;i<size;i++){
               sum += array[i];
          }
          return sum;
     }
     public static int countEven(int[] array , int size){
          int count=0;
          for(int i =0;i<size;i++){
               if(array[i]%2==0){
                    count++;
               }
          }
          return count;
     }
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter quantity element of array:");
          int n= sc.nextInt();
          int[] array = new int[n] ;
          for(int i=0 ;i<n;i++){
               System.out.print("Enter element " + i +":");
               array[i] = sc.nextInt();
          } 
          System.out.println(findMin(array,n));
          System.out.println(sum(array,n));
          System.out.println(countEven(array,n));
          sc.close();
     }
}
