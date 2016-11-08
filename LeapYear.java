class LeapYear{
   static void leapYear(int year){
   if(((year % 4 ==0) && (year % 100 !=0)) ||(year % 400 ==0)){
   System.out.println("Leap year");
   }
   else
   System.out.println("Not a leap year");
    }
    public static void main(String[] args) {
   leapYear(1994);     }
 }