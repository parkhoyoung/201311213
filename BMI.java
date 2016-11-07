 class BMI  {
    static private float weight;
    static private float height;
    BMI(float weight,float height){
    this.weight=weight;
    this.height=height;
    }
    static void computeBMI(){
    float myBMI = weight/(height*height);
    if( myBMI> 18.5 && myBMI<=24.99){
    System.out.println("normal weight");
    }
    else if(myBMI >= 25 && myBMI<=29.9){
    System.out.println("overweight");
    }
    }
    public static void main(String[] args) {
    BMI my=new BMI((float)60.0,(float)1.7);
    my.computeBMI();
    }
 }