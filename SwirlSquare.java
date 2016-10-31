 class SwirlSquare{
    static Turtle t1 = new Turtle();
    static void makeSwirlSquare(int size,int bigger,int turns,double degree){
     for(int i =0;i<turns;i++){
         if(i%2 !=0){
                   size+=bigger;
          }
     t1.forward(size);
     t1.right(degree);
     }
  }
   public static void main(String[] args){
   int size =5;
   int bigger = 5;
   int turns =30;
   float degree = 90.0f;
   makeSwirlSquare(size,bigger,turns,degree);
   }
 }