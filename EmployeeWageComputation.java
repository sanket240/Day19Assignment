package EmpWage;
import java.util.Scanner;
public class EmployeeWageComputation
{
        public static void Refactor()
        {
                int IS_FULL_TIME=1;
                int WAGE_PER_HOUR=20;
                int FULL_DAY_HOUR=8;
                int WORKING_DAYS=20;
                int dailyWage=0;
                int employee_hours=0;
                int PART_TIME_HOUR=8;
                double partTime=0;
                int monthlyWage=0;
                int total_Monthly_Wage=0;
                int days=0;
                int hours=0;
                int empHr=0;
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
                dailyWage=(employee_hours*WAGE_PER_HOUR);
                monthlyWage=(WORKING_DAYS*dailyWage);
                System.out.println("Monthly Wages:"+monthlyWage);
                System.out.println("DailyWage: MonthlWage:");
                while(days<=20 && empHr<=100)
                {
                        double empCheck1=Math.floor(Math.random()*10)%1;
                        int empCheck2=(int)empCheck1;
                        switch(empCheck2)
                        {
                        case 0:
                                empHr=empHr+4;
                                break;
                        case 1:
                                empHr=empHr+8;
                                break;
                        default:
                                System.out.println("Wrong choice");
                        }
                        days++;
                        dailyWage=(empHr*WAGE_PER_HOUR);
                        total_Monthly_Wage=(total_Monthly_Wage+dailyWage);
                        System.out.println(dailyWage + " " + total_Monthly_Wage);
                }
        }
	public static void main(String args[])
        {
        	System.out.println("Start");
        	Refactor();
        }
}
