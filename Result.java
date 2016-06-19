import java.util.*;
public class Result 
{
	Scanner reader = new Scanner(System.in);
	private int scode;
	private String course;
	
	public Result(int code, String cname)
	{
		scode=code;
		course=cname;
	}
	
	public void printCrse()                         //Print option #2
	{
		System.out.println("Subject Name       : "+ getName(scode));
		System.out.println("Highest Percentage : "+ getHighSubj(scode)+"%");
		System.out.println("Lowest Percentage  : "+ getLowSubj(scode)+"%");
		System.out.println("Average Percentage : "+ getAvgSubj(scode)+"%");
	}
	
	public int getHighSubj(int scode)              //Formula for getting highest percentage
	{	
		int mark = 0;
		if(scode==0)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark<Body.student[row].getMath(scode))
				{
					mark = Body.student[row].getMath(scode);
				}
			}
		}
		if(scode==1)
		{	
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark<Body.student[row].getBuss(scode))
				{
					mark = Body.student[row].getBuss(scode);
				}
			}
		}
		if(scode==2)
		{	
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark<Body.student[row].getJava(scode))
				{
					mark = Body.student[row].getJava(scode);
				}
			}
		}
		if(scode==3)
		{	
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark<Body.student[row].getDes(scode))
				{
					mark = Body.student[row].getDes(scode);
				}
			}
		}
		if(scode==4)
		{	
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark<Body.student[row].getPro(scode))
				{
					mark = Body.student[row].getPro(scode);
				}
			}
		}
		return mark;	
	}
	
	public int getLowSubj(int scode)                 //Formula for getting lowest percentage
	{	
		int mark = 100;
		if(scode==0)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark>Body.student[row].getMath(scode))
				{
					mark = Body.student[row].getMath(scode);
				}
			}
		}
		if(scode==1)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark>Body.student[row].getBuss(scode))
				{
					mark = Body.student[row].getBuss(scode);
				}
			}
		} 
		if(scode==2)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark>Body.student[row].getJava(scode))
				{
					mark = Body.student[row].getJava(scode);
				}
			}
		}
		if(scode==3)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark>Body.student[row].getDes(scode))
				{
					mark = Body.student[row].getDes(scode);
				}
			}
		}
		if(scode==4)
		{
			for(int row = 0;  row <= 4; row++ )
			{
				if(mark>Body.student[row].getPro(scode))
				{
					mark = Body.student[row].getPro(scode);
				}
			}
		}
		return mark;
	}
	
	public int getAvgSubj(int scode)                  //Formula for getting average percentage
	{
		int total = 0;
		int avg = 0;
		int row;
		if(scode==0)
		{
			for(row=0;row<=4;row++)
			{
				total = total + Body.student[row].getMath(row);
			}
			avg = total/5;
		}
		if(scode==1)
		{
			for(row=0;row<=4;row++)
			{
				total = total + Body.student[row].getBuss(row);
			}
			avg = total/5;
		}
		if(scode==2)
		{
			for(row=0;row<=4;row++)
			{
				total = total + Body.student[row].getJava(row);
			}
			avg = total/5;
		}
		if(scode==3)
		{
			for(row=0;row<=4;row++)
			{
				total = total + Body.student[row].getDes(row);
			}
			avg = total/5;
					
		}
		if(scode==4)
		{
			for(row=0;row<=4;row++)
			{
				total = total + Body.student[row].getPro(row);
			}
			avg = total/5;
		}
		return avg;
	}
	
	public String getName(int scode)                   //Getting course name
	{
		return course;
	}	
}
