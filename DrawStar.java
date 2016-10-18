import ch.aplu.turtle.*;
Turtle t1= new Turtle();
void DrawStar(int size){
for(int i=0; i<5; i++){
t1.forward(size);
t1.right(144);
}
}
DrawStar(100);