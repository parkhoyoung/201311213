class StarTriangle {
 	private int height;
 	private String star;
 	void Triangle(int height,String star){
 		this.height=height;
 		this.star=star;
 		StringBuffer hbuf=new StringBuffer();
 		for(int i=0; i<height; i++){
 			for(int j=i; j<height-1;j++){
 				hbuf.append(" ");
 			}
 			for(int k=0; k<=(i*2); k++){
 				hbuf.append("*");
 			}
 			System.out.printf("%s\n",hbuf.toString());
 			hbuf.delete(0, hbuf.length());
 		}
 	}
 	public static void main(String[] args) {
 		StarTriangle s=new StarTriangle();
 		s.Triangle(8, "*");
 	}
 }