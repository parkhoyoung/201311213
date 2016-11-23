public class Selection{
ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
Selection(){}
public void select(Rectangle r){
r.setSelected(true);
sArr.add(r);
System.out.println("selected:"+r.selected);
}
public void print(){
for(Rectangle r:sArr)
  System.out.print(r.toString());
}
}
