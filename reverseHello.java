class reverseHello{
void olleh(){
 String hello="hello";
 hello.toCharArray();
 char[] chArr=hello.toCharArray();
 StringBuilder olleh=new StringBuilder();
 for(int i=chArr.length-1;i>=0; i--)
 olleh.append(chArr[i]);
System.out.println(olleh);
}
public static void main(String[] args){
reverseHello rh= new reverseHello();
rh.olleh();
}
}
