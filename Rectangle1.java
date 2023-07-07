import java.util.Scanner;
class Rectangle1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        Test2 t=new Test2();
        System.out.println("Area of rectangle:"+t.Area(length,breadth));
        System.out.println("Perimeter of recctangle:"+t.Perimeter(length,breadth));

    }
}
class Test2{
    public double Area(int length,int breadth)
    {
        return length*breadth;
    }
    public double Perimeter(int length,int breadth)
    {
        return 2*(length+breadth);
    }
}