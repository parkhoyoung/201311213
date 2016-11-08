import java.util.Calendar;
 class Sunday {
         static int count;
 	 static void Sundaycount(){
 		Calendar c = Calendar.getInstance();
 		for(int i=1901; i<=2000; i++){
 	           for(int j=0; j<=11; j++){
 		       c.set(i,((Calendar.MONTH)+j), 1);
 		        int day=c.get(Calendar.DAY_OF_WEEK);
 			if(day==1)
                        {
 			  count++;
 			}
 		}
 	    }
 		System.out.println(count);
 	}
           public static void main(String[] args) {
 	   Sundaycount();
    }
 }