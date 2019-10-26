import java.util.Scanner;
public class testtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [][]k= {
			      {1,2,3,4},
			       {1,2,3,4},
			       {1,2,3,4},
			        {1,2,3,4}
	            };
	int coltotal=0;
	for (int i=0;i<k.length;i++) {
		coltotal +=k[i][0];
	
		}
	System.out.println(coltotal);
	int total=sum(k);
	
}

 public static int sum(int [][] values) {
	 int total=0;
	 for (int i=0; i<values.length; i++) {
		 for(int j=0; j<values.length; j++)
			 total+=values[i][j];
		 
	 }System.out.println(total);
	 return total;
 }
 
}


