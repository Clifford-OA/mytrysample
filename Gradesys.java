import java.util.Scanner;
public class Gradesys {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int Totalscore;
	System.out.println("Enter student's name");
	String StudentName = in.nextLine();
	System.out.println("Enter Exams score");
	int ExamScore = in. nextInt();
	System.out.println("Assessment Score");
	int Assessment = in.nextInt();
	Totalscore = ExamScore + Assessment;
	System.out.println("Totalscore of student is "+ Totalscore);
	if (Totalscore>=70)
	{
		System.out.println("Grade A");
	}
	if (Totalscore >=60  && (Totalscore<70))  
	{
		System.out.println("Grade B");
	}
	if (Totalscore>=50  && (Totalscore<60))
	{
		System.out.println("Grade C");
	}
	if (Totalscore>=40  && (Totalscore<50))
	{
		System.out.println("Grade D");
	}
	if (Totalscore<40)
	{
		System.out.println("Grade F");
	}
	 System.out.println("Enter school fees");
	 int schoolfees= in.nextInt();
	 if (Totalscore > 39 ) {
		  if  (schoolfees != 100) {
			  System.out.println("Dear " + StudentName + ", Certificate won't be awarded to you.You haven't paid your fees in full,Therefore you'll be repeated");
		  }
		  else
		 
		   if (schoolfees == 100) 
			  if (Totalscore>39)
			  System.out.println("Dear " + StudentName + ", Certificate will be awarded to you.");
		  }
		
			if  (ExamScore == 24 && Assessment==15) {
				if (schoolfees == 100)
				System.out.println("Dear " + StudentName + ", you've been condoned.");
				else 
				System.out.println("Dear " + StudentName + ", Certificate won't be awarded to you.You haven't paid your fees in full,Therefore you'll be repeated");
			}
			else
				if ( ExamScore==25 && Assessment ==14) {
					if (schoolfees ==100)
	System.out.println("Dear " + StudentName + ", you've been condoned.");
		
				else 
					System.out.println("Dear " + StudentName + ", Certificate won't be awarded to you.You haven't paid your fees in full,Therefore you'll be repeated");
				}}}
			
	
	
		  
		 




	