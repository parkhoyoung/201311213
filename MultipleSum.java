class MultipleSum {
    static private int num1=0;
    static private int num2=0;
    MultipleSum(int num1,int num2){
         this.num1=num1;
         this.num2=num2;
    }
    static void Sum(){
       int sum = 0;
       for(int i=1;i<=1000;i++){
       if(i%num1 ==0 || i% num2 ==0){
         sum += i;
       }
    }
    System.out.println("sum : "+sum);
    }
    public static void main(String[] args) {
        MultipleSum s=new MultipleSum(3,5);
       s.Sum();
    }
 }