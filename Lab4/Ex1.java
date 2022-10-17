import java.util.*;
public class Ex1 {
     public static void selectionSort(int[] array, int size){
          for(int i=0 ;i<size-1;i++){
               int min =i ;
               for(int j=i+1;j<size;j++){
                    if(array[j] < array[min]){
                         min = j;
                    }
               }
               int temp = array[min];
               array[min] = array[i];
               array[i] = temp;
          }
     }
     public static void bubbleSort(int[] array, int size){
          for(int i= 1;i<size;i++){
               for(int j = 0;j<size-i ;j++){
                    if(array[j+1] < array[j]){
                         int temp = array[j];
                         array[j] = array[j+1];
                         array[j+1] = temp;
                    }
               }
          }
     }
     public static void insertionSort(int[] array,int size){
          for(int i =1 ;i<size;i++){//chia ra thanh 2 mang, sorted and unsorted
               int key = array[i];
               int index = i-1;//giu vi tri truoc phan tu dau tien cua sorted
               while(index>=0 && key < array[index]){//so sanh value o sau co be hon o truoc
                    array[index+1] = array[index];//gan value tiep theo = value cua vi tri trc do
                    index = index -1; //tra index ve trc 1 don vi 
               }
               array[index +1 ]= key;
          }
     }
     public static void sort(int[] array,int l ,int r){
          if(l<r){
               int mid = l+ (r-l)/2;// tim pivot

               sort(array, l,mid);//sort list ben trai
               sort(array, mid+1 , r);//sort list ben phai
               
               mergeSort(array,l,mid,r);
          }
     }
     public static void mergeSort(int[] array,int left,  int mid ,int right) {
          int n1 = mid -left+1;
          int n2 = right - mid;
          //set size for two new array
          int L[] = new int[n1];
          int R[] = new int[n2];
          //copy element
          for(int i =0;i<n1;i++){
               L[i] = array[left+i];
          }
          for(int j =0 ;j<n2;j++){
               R[j] = array[mid +j+1];
          }
          int i=0,j=0;
          int k =left ;

          while(i<n1 && j< n2){//chay het 2 cai mang con
               if(L[i]<= R[j]){//tk nao lon hon thi quang vao trc
                    array[k] = L[i];
                    i++;
               }else{
                    array[k] = R[j];
                    j++;
               }
               k++;//sau moi lan cong thi index cua array tang 1
          }
          //neu 1 trong 2 cai mang het trc thi quang het mang con lai vao tr
          while(i< n1){
               array[k] = L[i];
               i++;
               k++;
          }
          while(j<n2){
               array[k] = R[j];
               j++;
               k++;
          }

     }
     
     public static void quickSort(int[] array,int low, int high){
          if(low < high){
               int index = partition(array,low,high);

               quickSort(array,low,index-1);
               quickSort(array,index +1 ,high);
          }
     }
     public static int partition(int[] array,int low , int high){
          int pivot = array[high];
          int left = low;
          int right = high-1;

          while(true){
               while(left <= right && array[left] < pivot){
                    left++;//find elements ben trai < pivot
               }
               while(right >= left && array[right] > pivot){
                    right --;//find elenment ben phai > pivot
               }
               if(left >= right){break;} //sorted finished and exit for
               int temp = array[left];
               array[left] = array[right];
               array[right] = temp;
               left++;
               right--;

          }
          int temp = array[left];
          array[left] = array[high];
          array[high] = temp;
          return left;//chi so chia doi mang
     }


     public static void printArray(int array[],int size){
          for(int i=0;i<size;i++){
               System.out.println(array[i]);
          }
     }

     public static void main(String[] args) {
          LinkedList<Integer> myList = new LinkedList<Integer>();
          myList.add(1);
          myList.add(5);
          myList.add(0);
          myList.add(8);
          myList.add(2);
          myList.add(0);
          myList.add(0);
          myList.add(3);
          int[] array = {3,4,2,4,8,9,5,6};
          int size = array.length;
          // selectionSort(array,size);
          // bubbleSort(array,size);
          // insertionSort(array, size);
          // sort(array,0,size-1);
          // quickSort(array,0,size-1);
          printArray(array,size); 
     }
}
