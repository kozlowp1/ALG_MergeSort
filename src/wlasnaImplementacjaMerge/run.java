package wlasnaImplementacjaMerge;



public class run {

	
	 public static void main(String[] args) {
		 double[] Vector= new double[4];
	 
			Vector[0]=1;
			Vector[1]=5;
			Vector[2]=3;
			Vector[3]=2;
			
			sorter revsrt = new sorter();
			revsrt.sortRev(Vector);
		 for(int i =0 ;i<4;i++){
			 System.out.println(Vector[i]);
		 }
		}
		
	
}
