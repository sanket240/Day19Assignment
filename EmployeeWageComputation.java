public class EmployeeWageComputation
{
	public static void main (String[] args)
	{
		int IS_FULL_TIME=1;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		int dailyWage=0;
		int employee_hours=0;
		int IS_FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Absent");
		dailyWage=(employee_hours*WAGE_PER_HOUR);
		System.out.println("Daily Wage:"+dailyWage);
	}
}
