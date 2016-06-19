import java.text.Format;
import java.util.*;
import java.io.*;

public class Body
{
	Scanner reader = new Scanner(System.in);
    static Student[]student = new Student[5];
    static Result result[] = new Result[5];
    private int num, stdno, coursecode, stdno1, updatesubj, coursecode1, oldPercent;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
   
    public int exept() throws IOException						//input validation #1 (Char input)
    {
    	String input;
    	int string1 = -1;
    	boolean check = false;
    	do
    	{
    		try
    		{
    			input = stdin.readLine();
    			string1 = Integer.parseInt (input);
    		}
    		catch (NumberFormatException nfe)
    		{
    			System.out.println("Invalid input format.");
    		}
			return string1;
    	}
    	while(!check);
   }
    
   public int checknum() throws IOException					//input validation #2 (Positive/input number checking)
   {
	   int num ;
	   num = exept();
	   while( num < 0 || num >100)
	   {
		   System.out.println("Please enter number 0 - 100. Try again.");
		   num = exept();
	   }
	   return num;
   }
    
   public int checknum1() throws IOException					//input validation #3 (Positive/input number checking)
   {
	   int num ;
	   num = exept();
	   while( num < 1 || num >5)
	   {
		   System.out.println("Please enter number 1-5. Try again.");
		   num = exept();
	   }
	   return num;
   }
    
   public int checknum2() throws IOException					//input validation #4 (Positive/input number checking)
   {
	   int num ;
	   num = exept();
	   while( num < 1 || num >6)
	   {
		   System.out.println("Please enter number 1-6. Try again.");
		   num = exept();
	   }
	   return num;
   }
    
   public void runProg() throws IOException					//Run the program
   {
	   student[0] = new Student("Jack Smith   ", 89, 70, 60, 74, 80);
	   student[1] = new Student("Jim Lucas    ", 70, 65, 90, 78, 90);
	   student[2] = new Student("Beck Barber  ", 56, 70, 63, 45, 60);
	   student[3] = new Student("Ann Walker   ", 87, 83, 56, 73, 70);
	   student[4] = new Student("Lucy Boxer   ", 65, 78, 79, 85, 80);
		
	   result[0] = new Result(0,"Maths      ");
	   result[1] = new Result(1,"Business   ");
	   result[2] = new Result(2,"Java       ");
	   result[3] = new Result(3,"Design     ");
	   result[4] = new Result(4,"Project    ");
    
	   do
	   {
		   mainmenu();
		   num = checknum1();
		
		   if(num==1)											//Option #1
		   {
			   do
			   {
				   stdnmenu();
				   stdno = checknum2();
				   int stdno1 = stdno - 1;
				   if(stdno == 0)
				   {
					   break;
				   }
				   if(stdno1<5)
				   {
					   student[stdno1].stdprint();
					   System.out.println();
				   } 
				}
				while(stdno<6);
		   }
		   else if(num==2)										//Option #2
		   {
			   do
			   { 
				   coursemenu();
				   coursecode = checknum2();
				   int coursecode1 = coursecode - 1;
				   if(coursecode==0)											
				   {
					   break;
				   }
				   if(coursecode1<5)
				   {
					   result[coursecode1].printCrse();
					   System.out.println();
				   }
			   }
			   while(coursecode<6);
		   }
		   else if(num==3)										//Option #3
		   {
			   stdnmenu();
			   stdno = checknum2();
			   int stdno1 = stdno - 1;
			   if(stdno1>=0&&stdno1<5)
			   {
				   coursemenu();
				   coursecode = checknum2();
				   coursecode1 = coursecode - 1;
			
				   if(coursecode1>=0&&coursecode1<5)
				   {
					   System.out.println("Student name : "+student[stdno1].getStudent(stdno1));
					   System.out.println("Course Name : "+result[coursecode1].getName(stdno1));
					   if(coursecode1==0)
					   {
						   System.out.println("Course Percentage : "+student[stdno1].getMath(coursecode1)+"%");
						   oldPercent = student[stdno1].getMath(coursecode1);
					   }
					   if(coursecode1==1)
					   {
						   System.out.println("Course Percentage : "+student[stdno1].getBuss(coursecode1)+"%");
						   oldPercent = student[stdno1].getBuss(coursecode1);
					   }
					   if(coursecode1==2)
					   {
						   System.out.println("Course Percentage : "+student[stdno1].getJava(coursecode1)+"%");
						   oldPercent = student[stdno1].getJava(coursecode1);
					   }
					   if(coursecode1==3)
					   {
						   System.out.println("Course Percentage : "+student[stdno1].getDes(coursecode1)+"%");
						   oldPercent = student[stdno1].getDes(coursecode1);
					   }
					   if(coursecode1==4)
					   {
						   System.out.println("Course Percentage : "+student[stdno1].getPro(coursecode1)+"%");
						   oldPercent = student[stdno1].getPro(coursecode1);
					   }

					   System.out.println();
					   System.out.println("Please enter new percentage :");
					   updatesubj = checknum();
					   if(coursecode1==0)
					   {
						   updateMath();
					   }
					   if(coursecode1==1)
					   {
						   updateBuss();
					   }
					   if(coursecode1==2)
					   {
						   updateJava();
					   }
					   if(coursecode1==3)
					   {
						   updateDes();
					   }
					   if(coursecode1==4)
					   {	
						   updatePro();
					   }
					   System.out.println("New percentage: "+updatesubj+"%");
					   student[stdno1].stdprint();
					}
				}
			}
			else if(num==4)											//Option #4
			{
				Student.printTable();
				Student.StdAvg();
				Student.HighAveStd();
			}
			else if (num > 5 || num <= 0) 
			{ 
				System.out.println(); System.out.println("Please enter a number between 1 and 5."); 
			}
		}
		while(num!=5);
		System.out.println("***** Thank you for using Student Record *****");
	}	
	
	public void updateMath()										//Math modification
	{
		student[stdno1] = new Student(student[stdno1].getStudent(stdno1), updatesubj, 
						  student[stdno1].getBuss(coursecode1), student[stdno1].getJava(coursecode1), 
						  student[stdno1].getDes(coursecode1), student[stdno1].getPro(coursecode1));
	}
	
	public void updateBuss()										//Business modification
	{
		student[stdno1] = new Student(student[stdno1].getStudent(stdno1), student[stdno1].getMath(coursecode1), 
				          updatesubj,student[stdno1].getJava(coursecode1), student[stdno1].getDes(coursecode1), 
				          student[stdno1].getPro(coursecode1));
	}
	
	public void updateJava()										//Java modification
	{
		student[stdno1] = new Student(student[stdno1].getStudent(stdno1), student[stdno1].getMath(coursecode1), 
				          student[stdno1].getBuss(coursecode1), updatesubj, student[stdno1].getDes(coursecode1), 
				          student[stdno1].getPro(coursecode1));
	}
	
	public void updateDes()											//Design modification
	{
		student[stdno1] = new Student(student[stdno1].getStudent(stdno1), student[stdno1].getMath(coursecode1), 
				          student[stdno1].getBuss(coursecode1), student[stdno1].getJava(coursecode1), updatesubj, 
				          student[stdno1].getPro(coursecode1));
	}
	
	public void updatePro()											//Project modification
	{
		student[stdno1] = new Student(student[stdno1].getStudent(stdno1), student[stdno1].getMath(coursecode1), 
				          student[stdno1].getBuss(coursecode1), student[stdno1].getJava(coursecode1), 
				          student[stdno1].getDes(coursecode1), updatesubj);
	}
	
	public void mainmenu()											//Main menu
	{
		System.out.println("**** Welcome To Student Record ****");
		System.out.println();
		System.out.println("Please enter your selection:");
		System.out.println("1. Personal student's result (percentage marks and grades in all 5 courses.)");
		System.out.println("2. Overall course's result.");
		System.out.println("3. Student's result modification.");
		System.out.println("4. Whole table result.");
		System.out.println("5. End program.");
	}
	
	public void stdnmenu()											//Student's option menu
	{
		System.out.println();
		System.out.println("Please enter student ID: ");
		System.out.println("1: Jack Smith");
		System.out.println("2: Jim Lucas");
		System.out.println("3: Beck Barber");
		System.out.println("4: Ann Walker");
		System.out.println("5: Lucy Boxer");
		System.out.println("6: Back to main menu");
	}

	public void coursemenu()										//Course's Option menu
	{
		System.out.println();
		System.out.println("Please enter course code: ");
		System.out.println("1: Math");
		System.out.println("2: Business");
		System.out.println("3: Java");
		System.out.println("4: Design");
		System.out.println("5: Project");
		System.out.println("6: Back to main menu");
	}
}


