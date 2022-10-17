public class Fraction {
     private  int number;
     private  int denom;
     public Fraction(){
          this.number = 0 ;
          this.denom = 1; 
     }
     public Fraction(int x, int y){
          this.number = x ;
          this.denom = y ;
     }
     public Fraction(Fraction f){
          this.number = f.number ;
          this.denom = f.denom ;
     }
     public String toString(){
          return "Number:"+ this.number + "" +" " + "Denom:"+ this.denom;
     }
     public boolean equals(Object f){
          if(!(f instanceof Fraction )){
               return false;
          }
          Fraction tmp = (Fraction) f ;
          if((float)(this.number/this.denom) == (float)(tmp.number/tmp.denom)){
               return true;
          }
          return false;
     }
}
