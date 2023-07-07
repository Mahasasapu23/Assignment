import java.io.*;
import java.util.Scanner;
class Reverse{
	public static void main(String[] args)
	{
		String str = "maha",nstr="";
		char ch;
		System.out.println("original word:");
		System.out.println("maha");
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse word:"+nstr);
	}
}