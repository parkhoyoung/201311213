class Temperature {
 	static double temp;
 	double c;
 	double f;
 	static void alter(double k,char a){
 		if(a=='f'){
 			temp = (5.0 / 9.0) * (k - 32);
 			System.out.printf("Alter F to C:  %.1f",temp);
 			System.out.println();
 		}
 		else if(a=='c'){  			 temp= (k * 9.0 / 5.0) + 32;
 			 System.out.printf("Alter C to F:  %.1f",temp);
 			 System.out.println();
 		}
 	}
 	public static void main(String[] args) {
 		Temperature.alter(100,'f');
 		Temperature.alter(50, 'c');
 	}
 }