import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void DrawSquare(int size){
for(int i=0; i<4; i++){
t1.forward(size);
t1.right(90);
}
}
DrawSquare(100);