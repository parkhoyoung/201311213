class RockScissorPaper{
 	String p1;
 	String p2;
 	RockScissorPaper(String a,String b){
 		p1=a;
 		p2=b;
 	}
	void play(){
 		if(p1.equals("rock")){
 			if(p2.equals("rock")){
 				System.out.println("Draw");
 			}
 			else if(p2.equals("scissor")){
				System.out.println("player 1 Win");
 			}
 			else if(p2.equals("paper")){
 				System.out.println("player 2 Win ");
 			}
 		}
 		else if(p1.equals("scissor")){
 			if(p2.equals("rock")){
 				System.out.println("player 2 Win");
 			}
 			else if(p2.equals("scissor")){
 				System.out.println("Draw");
			}
 			else if(p2.equals("paper")){
 				System.out.println("player 1 Win");
 			}
		}
		else if(p1.equals("paper")){
 			if(p2.equals("rock")){
 				System.out.println("player 1 Win");
 			}
 			else if(p2.equals("scissor")){
 				System.out.println("player 2 Win.");
 			}
 			else if(p2.equals("paper")){
                                System.out.println("Draw");
 			}
 		}
 		else{
 			System.out.println("Wrong Input");
 		}
 	}
 	public static void main(String[] args) {
 		RockScissorPaper r=new RockScissorPaper("paper", "scissor");
 		r.play();
 	}
 }