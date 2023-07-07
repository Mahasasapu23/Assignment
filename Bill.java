import java.util.Scanner;
public class Bill
{
    public static int calculateBill(int units) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Select the CDI category:");
        System.out.println("1. Commercial");
        System.out.println("2. Domestic");
        System.out.println("Industrial");
        System.out.println("Enter your choice");
        int category=sc.nextInt();

        switch(category)
        {
            case 1:
                if(units<=100)
                    return units*2;
                else if(units<=200)
                    return (100*2)+(units-100)*4;
                else 
                    return (100*2)+(100*4)+(units-200)*6;
            //break;
           case 2:
                if(units<=100)
                    return units*1;
                else if(units<=200)
                    return (100*1)+(units-100)*2;
                else 
                    return (100*1)+(100*2)+(units-200)*3;
                //break;
           case 3:
                if(units<=100)
                    return units*3;
                else if(units<=200)
                    return (100*3)+(units-100)*6;
                else 
                    return (100*3)+(100*6)+(units-200)*9;
                //break;
           default :
            System.out.println("Invalid");

        }
        return 0;

    }
    public static void main(String args[])
    {

        int units=250;
        System.out.println("calculateBill"+calculateBill(units));
    }
}