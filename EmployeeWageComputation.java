class CompanyEmpWage
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
   	 public CompanyEmpWage(String name,int Workingdays,int Workinghours)
    	{
        	this.name=name;
        	this.Workingdays=Workingdays;
        	this.Workinghours=Workinghours;
    	}
    	public void setName(String name)
    	{
        	this.name=name;
    	}
    		public void setWorkingdays(int Workingdays)
    	{
        	this.Workingdays=Workingdays;
    	}
    	public void setWorkinghours(int Workinghours)
    	{
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
               	System.out.println("Total Employee Wage for company is:"+name+"is:"+total_Monthly_Wage); 
    	}
}
public class EmployeeWageComputation
{
	public static void main(String args[]) 
    	{
      		CompanyEmpWage c1[]=new CompanyEmpWage[3];
      		c1[0]=new CompanyEmpWage("Atos",20,120);
      		c1[1]=new CompanyEmpWage("Silverlink",20,200);
      		c1[2]=new CompanyEmpWage("TCS",20,220);
    		for(int i=0;i<c1.length;i++)
    		{
        		c1[i].EmployeeMonthlyWage();
        		System.out.println("  ");
		}
    	}
}
