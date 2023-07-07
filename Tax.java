import java.util.Scanner;
public class Tax
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income");
        double salary=sc.nextDouble();
        CalculateTax t=new CalculateTax();
        System.out.println(t.calTax(salary));
    }
}
class CalculateTax
{
    public double calTax(double salary)
    {
        double tax;
        if(salary<=250000)
	tax=0;
        else if(salary<=500000)
            tax=(salary-250000)*0.1;
        else if(salary<=1000000)
		tax=25000+(salary-500000)*0.2;
        else
            tax=125000+(salary-1000000)*0.3;
        return tax;
    }
}
