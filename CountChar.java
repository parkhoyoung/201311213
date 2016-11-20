import java.util.HashMap;
import java.util.Map;
  public class CountChars {
 static void CountWord(char[] letters){
 Map<String,Integer> words = new HashMap<String,Integer>();
 String str;
 for(char c:letters){
  str = Character.toString(c);
 if(words.containsKey(str)){
      words.put(str, words.get(str)+1);
  }
 else{
          words.put(str, 1);
  }
  }
  System.out.println(letters);
  System.out.println("count:"+words);
 }
  public static void main(String[] args){
  char[] character = "sangmyung university".toCharArray();
  CountWord(character);
  }
 }
 public class CountChar {
 static void CountWord(char[] letters){
 Map<String,Integer> words = new HashMap<String,Integer>();
 String s;
 for(char c:letters){
  s = Character.toString(c);
 if(words.containsKey(s)){
      words.put(s, words.get(s)+1);
  }
 else{
          words.put(s, 1);
  }
  }
  System.out.println(letters);
  System.out.println("count:"+words);
 }
  public static void main(String[] args){
  char[] cw = "sangmyung university".toCharArray();
  CountWord(cw);
  }
 }