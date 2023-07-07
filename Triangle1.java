import java.io.*;
 
class Triangle1 {
 
    static double area(double h, double b)
    {
        return (h * b) / 2;
    }
    static double perimeter(double a,double d,double c)
    {
       return a+d+c;
    }
 
    public static void main(String[] args)
    {
        double h = 10;  
        double b = 5;
	double a=3;
	double d= 4;
	double c= 6;
        System.out.println("Area of the triangle: "
                           + area(h, b));
	System.out.println("perimeter:"+perimeter(a,d,c));
    }
}