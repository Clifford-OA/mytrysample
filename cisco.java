import java.util.Scanner;
public class cisco {
public static String StudentName;
public static int score;

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Input the number of Student");
	int num=input.nextInt();
	int n[]=new int [num];
	int mark;
	int i,j,sumone=0,sumtwo=0;
	for(i=1;i<=num;i++)
	{
		System.out.println("Enter Student Name");
		String StudentName =input.next();
	System.out.println("Enter Student Score");
	int score =input.nextInt();	
switch(score) {
case 1:
	if (score==1)
		sumone=sumone+1;
	break; 
case 2:
	if (score==2)
		sumtwo=sumtwo+1;
default :
	if (score>2)
		continue;
	}

}
	System.out.println(StudentName+" "+score);
	System.out.println("The number of students who had score one is/are "+ sumone);
	System.out.println("The number of students who had score two is/are "+ sumtwo);
	}
	

}