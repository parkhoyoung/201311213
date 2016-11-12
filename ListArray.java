import java.util.ArrayList;
import java.util.List;
 class ListArray {
 void listNumber(ArrayList<Integer> m_List)
        {
 int i=1;
 while(i<=1000)
                {
 if(i%4==0&&i%5!=0)
                {
          m_List.add(i);
 }
 i++;
 }
 System.out.println(m_List);
 }
 int sumList(ArrayList<Integer> m_List){
 int sum=0;
 int maxiter=m_List.size();
 for(int i=0;i<maxiter;i++){
 sum+=m_List.get(i);
 }
 System.out.println("sum ="+sum);
 return sum;
 }
 public static void main(String[] args)
        {
         ArrayList<Integer>mylist=new ArrayList<Integer>();
 ListArray a=new ListArray();
 a.listNumber(mylist);
 a.sumList(mylist);
 }
 }