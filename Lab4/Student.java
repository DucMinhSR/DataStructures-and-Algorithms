public class Student {
     private String name;
     private double mathematics;
     private double programming;
     private double DSA1;
     private double averageGrade;
     public Student(){
          this.name = "";
          this.mathematics = 0.0;
          this.programming = 0.0;
          this.DSA1 = 0.0;
          this.averageGrade = 0.0;
     }
     public Student(String name, double Mathematics, double Programming, double   DSA1){
          this.name = name;
          this.mathematics = Mathematics;
          this.programming = Programming;
          this.DSA1 = DSA1;
     }
     public String getName(){
          return this.name;
     }
     public void setName(String name){
          this.name = name;
     }
     public double getMathematics(){
          return this.mathematics;
     }
     public void setMathematic(double math){
          this.mathematics = math;
     }
     public double getPrograming(){
          return this.programming;
     }
     public void setPrograming(double program){
          this.programming = program;
     }
     public double getDSA1(){
          return this.DSA1;
     }
     public void setDSA1(double DSA1){
          this.DSA1 = DSA1;
     }
     public double getAverage(){
          this.averageGrade = (this.mathematics + this.programming + this.DSA1)/3.0;
          return averageGrade;
     }
     public String toString(){
          return this.getName() + ","+ this.getMathematics() 
          + "," +this.getPrograming() +","+this.getDSA1() + ","+this.getAverage();
     }
}
