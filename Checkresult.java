import java.util.Scanner;

public class Checkresult {
	
	

	public static int score;
	public static String StudentName;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
System.out.println("Enter the number of student");
 int num = in.nextInt();
int i=1, sumone=0, sumtwo =0;

do {
	
	System.out.println("Enter Student Name");
	String StudentName= in.next();
	System.out.println("Enter Student Score");
	int score= in.nextInt();
	if (score==1) 
		sumone=sumone+1;
else
	if (score==2) 
		sumtwo=sumtwo+1; 
	i++;
	}
while(i<=num);
for (i=1;i<=num;i++)
	System.out.println(StudentName +" "+score);
{

System.out.println("The number of students who had score one is/are "+ sumone);
System.out.println("The number of students who had score two is/are "+ sumtwo);
}
	
	}}
