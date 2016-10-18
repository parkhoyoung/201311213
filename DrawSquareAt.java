import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void DrawSquareAt(int size,double x, double y){
t1.setPos(x,y);
   for(int i=0; i<4; i++){
      t1.forward(size);
      t1.right(90);
      }
}
DrawSquareAt(100,20,20);