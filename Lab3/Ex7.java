public class Ex7 {
     public static int findMin(int array[] , int size){
          if(size == 0){
               return -1;
          }
          if(size ==1){
               return  array[0];
          }
          if(array[size-1] < findMin(array, size-1)){
               return array[size-1];
          }
          return findMin(array, size-1);
     }
     public static int sumArray(int[] array, int size){
          if(size==1 ){
               return array[0];
          }
          return array[size-1] + sumArray(array,size-1); 
     }
     public static int countEvenNumber(int array[], int size){
          if(size ==0 ){
               return 0;
          }
          if(array[size -1]%2==0){ 
               return 1+countEvenNumber(array,size-1);
          }
          return countEvenNumber(array,size-1);
     }
     public static void main(String[] args){
          int[] array = {4,3,5,7,2,4,6,8};
          System.out.println(findMin(array,8));
          System.out.println(sumArray(array,8));
          System.out.println(countEvenNumber(array,8));
     }
     
}
