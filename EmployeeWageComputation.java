package EmpWage;
import java.util.Scanner;
public class EmployeeWageComputation
{
	public static void main (String[] args)
     	{
        	int IS_FULL_TIME=1;
             	int WAGE_PER_HOUR=20;
             	int FULL_DAY_HOUR=8;
             	int dailyWage=0;
             	int employee_hours=0;
             	int PART_TIME_HOUR=8;
             	double partTime=0;
             	double empCheck=Math.floor(Math.random()*10)%2;
             	System.out.println("!.Employee Attendance 2.DailyWages 3.Part Time Wages Enter your choice:");
             	Scanner s1=new Scanner(System.in);
             	int choice=s1.nextInt();
             	switch(choice)
             	{
             	case 1:
             		if(empCheck==IS_FULL_TIME)
             		{
                         	System.out.println("Employee is present");
             			employee_hours=8;
             		}
             		else
             		{
             			System.out.println("Employee is Absent");
             			employee_hours=0;
             		}
             		break;
             	case 2:
        		employee_hours=8;
             		dailyWage=(employee_hours*WAGE_PER_HOUR);
             		System.out.println("Daily Wage:"+dailyWage);
             		break;
             	case 3:
             		double partTime_hours=Math.floor(Math.random()*10)%8;
             		partTime=(partTime_hours*WAGE_PER_HOUR);
             		System.out.println("Part time wages:"+partTime);
             		break;
             	default:
            	 	System.out.println("Wrong choice");
            	}
     	}

}

