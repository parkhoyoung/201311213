import java.util.ArrayList;
import java.util.Collections;
public class SortStudent {
 private String name;
 private int number;
 SortStudent(String name, int number){
 this.name = name;
 this.number = number;
 }
 public String getName(){
 return name;
 }
 static void Sorting() {
 ArrayList<String> NameList = new ArrayList<String>();
 Student s1 = new Student("Student1",1);
 Student s2 = new Student("Student2",2);
 Student s3 = new Student("Student3",1);
 Student s4 = new Student("Student6",2);
 Student s5 = new Student("Student5",1);
 Student s6 = new Student("Student4",2);
NameList.add(s1.getName());
NameList.add(s2.getName());
NameList.add(s3.getName());
NameList.add(s4.getName());
NameList.add(s5.getName());
NameList.add(s6.getName());
Collections.sort(NameList);
System.out.println(NameList);
  }
 public static void main(String[] args) {
  Sorting();
 }
 }