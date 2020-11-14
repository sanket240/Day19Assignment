public class  EmployeeWageComputation
{
	int IS_FULL_TIME=1;
    	int WAGE_PER_HOUR=20;
    	int FULL_DAY_HOUR=8;
        int dailyWage=0;
        int employee_hours=0;
        int PART_TIME_HOUR=8;
        double partTime=0;
        int monthlyWage=0;
        int total_Monthly_Wage=0;
        int days=0;
        int hours=0;
        int empHr=0;
        String name;
        int Workingdays;
        int Workinghours;
    	public  EmployeeWageComputation(String name,int Workingdays,int Workinghours)
    	{
        	this.name=name;
        	this.Workingdays=Workingdays;
        	this.Workinghours=Workinghours;
    	}
	public void EmployeeMonthlyWage()
    	{
        	while(days<=Workingdays && empHr<=Workinghours)
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
                }
                total_Monthly_Wage=Workinghours*WAGE_PER_HOUR;
    	}
    	public String toString()
    	{
        	return "Total Employee Wage for company is:"+name+"is:"+total_Monthly_Wage;
    	}
	public static void main(String args[])
	{
     		EmployeeWageComputation emp=new EmployeeWageComputation("Atos",20,500);
     		EmployeeWageComputation emp1=new EmployeeWageComputation("Silverlink",20,450);
     		EmployeeWageComputation emp2=new EmployeeWageComputation("TCS",20,600);
     		emp.EmployeeMonthlyWage();
     		System.out.println(emp);
     		emp1.EmployeeMonthlyWage();
     		System.out.println(emp1);
     		emp2.EmployeeMonthlyWage();
     		System.out.println(emp2);
    	}
}
