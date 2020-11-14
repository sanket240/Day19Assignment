import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
interface IComputeEmpWage
{
    public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
public class CompanyEmpWage
{
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;
    pubilc CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
    {
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
        totalEmpWage=0;
    }
    public void setTotalEmpWage(int totalEmpwage)
    {
        this.totalEmpWage=totalEmpWage;   
    }
    public String toString()
    {
        return "Total Emp Wage for Company:"+company+"is"+totalEmpWage;   
    }
}
public class EmpWageBuilder implements IComputeEmpWage
{

    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    private int numOfCompany=0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String,CompanyEmpWage> CompanyToEmpWageMap;
    public EmpWageBuilder()
    {
        companyEmpWageList=new LinkedList<>();
        companyToEmpWageMap=new HashMap<>();
    }
    public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
    {
        CompanyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company,companyEmpWage);
    }
    public void computeEmpWage()
    {
        for (int i=0;i<companyEmpWageList.size();i++)
        {
            CompanyEmpWage companyWage=companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    public int getTotalWage(String company)
    {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
	
		int empHours=0, totalWorkingDays=0, totalEmpHours=0;
		while (totalEmpHours <= companyEmpWage.workingHours && totalWorkingDays < companyEmpWage.workingDays){
                        totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck){
				case IS_PART_TIME:
					empHours=8;
					break;
				case IS_FULL_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
			totalEmpHours += empHours;
		}
		System.out.println("total employee working hour - "+totalEmpHours);
        	System.out.println("total employee working days - "+totalWorkingDays);
        	return totalEmpHours * companyEmpWage.wagePerHour;
	}
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		CompanyEmpWage empWage = new CompanyEmpWage();
		empWage.addCompanyEmpWage("Tata",20,20,100);
		empWage.addCompanyEmpWage("Jio",10,25,150);
		empWage.computeEmpWage();
		final int totalWage = empWage.getTotalWageByCompanyName("Tata");
		System.out.println("Total Emp Wages for Tata : "+totalWage);
	}
}
