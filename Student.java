import java.util.*;
public class Student {
	Scanner reader = new Scanner(System.in);
	private int studentno;
	private String studentname;
	private int math;
	private int business;
	private int java;
	private int design;
	private int project;
	private static int highest;
	private static String name = null;
	
	public Student(String stdname, int maths, int businesss, int javas, int designs, int projects)
	{
		 studentname = stdname;
		 math = maths;
		 business = businesss;
		 java = javas;
		 design = designs;
		 project = projects;	 
	}
	
	public String getStudent(int stdno)            //Getting student name
	{
		return studentname;
	}
	
	public String getStudentName(String student)   //Getting student name
	{
		return studentname;
	}
	
	public int getMath(int stdno)                  //Get student's Math Score
	{
		return math;
	}
	
	public int getBuss(int stdno)                  //Get student's Business Score
	{
		return business;
	}
	
	public int getJava(int stdno)					//Get student's Java Score
	{
		return java;
	}
	
	public int getDes(int stdno)					//Get student's Design Score
	{
		return design;
	}
	
	public int getPro(int stdno)					//Get student's Project Score
	{
		return project;
	}
	
	public static void printTable()					//Print the whole table with average percentage on students and courses, option #4 (Summary)
	{
		
		System.out.print("                     "+Body.student[0].getStudent(0)+""+Body.student[1].getStudent(1)+"");
		System.out.println(Body.student[2].getStudent(2)+Body.student[3].getStudent(3)+""+Body.student[4].getStudent(4));
		System.out.println(Body.result[0].getName(0)+"              "+Body.student[0].getMath(0)+"          "+Body.student[1].getMath(1)+"            "+Body.student[2].getMath(2)+"            "+Body.student[3].getMath(3)+"         "+Body.student[4].getMath(4));
		System.out.println(Body.result[1].getName(1)+"              "+Body.student[0].getBuss(0)+"          "+Body.student[1].getBuss(1)+"            "+Body.student[2].getBuss(2)+"            "+Body.student[3].getBuss(3)+"         "+Body.student[4].getBuss(4));
		System.out.println(Body.result[2].getName(2)+"              "+Body.student[0].getJava(0)+"          "+Body.student[1].getJava(1)+"            "+Body.student[2].getJava(2)+"            "+Body.student[3].getJava(3)+"         "+Body.student[4].getJava(4));
		System.out.println(Body.result[3].getName(3)+"              "+Body.student[0].getDes(0)+"          "+Body.student[1].getDes(1)+"            "+Body.student[2].getDes(2)+"            "+Body.student[3].getDes(3)+"         "+Body.student[4].getDes(4));
		System.out.println(Body.result[4].getName(4)+"              "+Body.student[0].getPro(0)+"          "+Body.student[1].getPro(1)+"            "+Body.student[2].getPro(2)+"            "+Body.student[3].getPro(3)+"         "+Body.student[4].getPro(4));
		System.out.println();
	}
	
	public static void StdAvg()
	{
		System.out.println("| Student Average Percentage |");
		System.out.println();
		for(int row = 0;  row <= 4; row++)
		{
			System.out.print("  "+Body.student[row].getStudent(row)+"    "+avg(row));
			if(highest<(avg(row)))
			{
				highest = (avg(row));
				name = Body.student[row].getStudent(row);
			}	
			
			System.out.println();
		}
	}
	
	public static void HighAveStd()
	{	
		int totalMath=0;
		int totalBuss=0;
	    int totalJava=0;
	    int totalDes=0;
	    int totalPro=0;
	    
		for(int row = 0;  row <= 4; row++)
		{
			totalMath = totalMath+Body.student[row].getMath(row);
			totalBuss = Body.student[row].getBuss(row)+totalBuss;
			totalJava = Body.student[row].getJava(row)+totalJava;
			totalDes = Body.student[row].getDes(row)+totalDes;
			totalPro = Body.student[row].getPro(row)+totalPro;
		}
		
		System.out.println();
		System.out.println("  Highest Average Student:   "+name+""+highest);
		System.out.println();
		System.out.println("| Course Average Percentage |");
		System.out.println();
		System.out.println("  "+Body.result[0].getName(0)+"  "+totalMath/5+"%");
		System.out.println("  "+Body.result[1].getName(1)+"  "+totalBuss/5+"%");
		System.out.println("  "+Body.result[2].getName(2)+"  "+totalJava/5+"%");
		System.out.println("  "+Body.result[3].getName(3)+"  "+totalDes/5+"%");
		System.out.println("  "+Body.result[4].getName(4)+"  "+totalPro/5+"%");
		System.out.println();
	}

	public static int avg(int row)
	{
		int avrg;
		avrg = (Body.student[row].getMath(row)+
				Body.student[row].getBuss(row)+
				Body.student[row].getJava(row)+
				Body.student[row].getDes(row)+
				Body.student[row].getPro(row))/5;
		return avrg;
	}
	
	public void stdprint()							//Print option #1
	{
		System.out.println("Student Name: "+getStudentName(studentname));
		System.out.println();
		System.out.println("Subject     Percentage    Grades");
		System.out.println("Math:        "+getMath(studentno)+"%"+"        " +  getGrades(math));
		System.out.println("Business:    "+getBuss(studentno)+"%"+"        " + getGrades(business));
		System.out.println("Java:        "+getJava(studentno)+"%"+"        " + getGrades(java));
		System.out.println("Design:      "+getDes(studentno)+"%"+"        "+ getGrades(design));
		System.out.println("Project:     "+getPro(studentno)+"%"+"        "+ getGrades(project));
		System.out.println();
	}
	
	public String getGrades(int marks)				//Get Grades for subject
	{	
		if (marks == 0 || marks <= 49)
		{
		   return "NN";
		}
		else if (marks == 50 || marks <= 59)
		{
			return "PA";
		}
		else if (marks == 60 || marks <= 69)
		{
			return "CR";
		}
		else if (marks == 70 || marks <= 79)
		{
			return "DI";
		}
		else if (marks == 80 || marks <= 100)
		{
			return "HD";
		}
		return "Grades";
	}
}
