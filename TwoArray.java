
public class TwoArray {

	public static void main(String[] args) {
  parent p = new parent();
  p.arr1();
  p.arr2();
 p. multiplication();
p.Display();
  
	}
	
}
	
	
    class parent {
    	

    	int arr1[][] = {{1,2,3,4},{5,6,7,8},{9,0,2,1},{5,3,5,7}};
    	int arr2[][] = {{3,6,5,8,},{5,6,7,8},{6,3,6,7},{0,4,3,5}};
    	int results[][]= new int [arr1.length][arr2.length];

    void arr1(){
		for (int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[1].length; j++) {
			System.out.print(arr1[i][j] +" ");
	}
			System.out.println();
		}
    }
		 void arr2(){
			 System.out.println();
				for (int i=0; i<arr2.length; i++) {
					for(int j=0; j<arr2[1].length; j++) {
					System.out.print(arr2[i][j] +" ");
			}
					System.out.println();
					
				}
		 }
void multiplication() {
	

	for (int i=0; i<arr2.length; i++) {
		for(int j=0; j<arr2[1].length; j++) {
			for(int k=0; k<arr2.length; k++) {
		results[i][j]=results[i][j]+arr1[i][k]*arr2[k][j];
		
}
		System.out.println();
		}
		}
	}
    
    
    void Display(){
		 System.out.println("The Multiplication Results is ");
		 System.out.println();
			for (int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[1].length; j++) {
				System.out.print(results[i][j] +" ");
		}
				System.out.println();
			}
    }
    }