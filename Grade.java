class Grade {
 	static char grade;
 	static void computeGrade(double marks){
 		if(marks>=90&&marks<=100){
 			grade='A';
 		}
 		else if(marks>=80&&marks<90){
 			grade='B';
 		}
 		else if(marks>=70&&marks<80){
 			grade='C';
 		}
 		else if(marks>=60&&marks<70){
 			grade='D';
 		}
 		else{
 			grade='F';
 		}
 		System.out.println("My grade: "+grade);
 	}
 	public static void main(String[] args) {
 		ComputeGrade a=new ComputeGrade();
 		a.computeGrade(85);
 	}
 }