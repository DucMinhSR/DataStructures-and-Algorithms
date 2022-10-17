import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Ex2 {
     public static void main(String[] args){
          ArrayList<Student> myList = new ArrayList<Student>();
          Student st1 = new Student("DucMinh",5.0,6.0,7.0);
          Student st2 = new Student("ThanhTam",8.0,7.0,6.0);
          Student st3 = new Student("TuongVy",9.0,10.0,8.0);
          Student st4 = new Student("TungLam",2.0,7.0,8.0);
          myList.add(st1);
          myList.add(st2);
          myList.add(st3);
          myList.add(st4);

          System.out.println("Sort list student by average asc:");
          Collections.sort(myList, new Comparator<Student>(){
               public int compare(Student st1,Student st2){
                    return st1.getAverage()> st2.getAverage() ?1 :-1;
               }
          });
          System.out.println(myList.toString());

          System.out.println("Sort list student by average desc:");
          Collections.sort(myList, new Comparator<Student>(){
               public int compare(Student st1,Student st2){
                    return st1.getAverage() < st2.getAverage() ?1 :-1;
               }
          });
          System.out.println(myList.toString());
     }
}
