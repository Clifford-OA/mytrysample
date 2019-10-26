import java.util.Scanner;
public class ArrayMultiplication {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
int arr[][] ;
int resutls[][]= new int [][];

System.out.println("Enter row  and column size ");
int a=input.nextInt();
int b=input.nextInt();
arr= new int [a][b];
// getting the elements
System.out.println("Enter the Elements");
for (int i=0; i<arr.length; i++) {
	for (int j=0; j<arr[1].length; j++) {
		arr[i][j] =input.nextInt();
	}
	}
// scaler multiplication (scaler =2)
	for (int i=0; i<arr.length; i++) {
		for (int j=0; j<arr[1].length; j++) {
	System.out.println(arr[i][j]*2 +" ");	
		}
}
}}