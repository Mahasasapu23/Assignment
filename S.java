import java.util.Scanner;
class S
{
  int[] stack= new int[10];
  int top;
  S()
  {
   top=-1;
  }
  void push(int ele)
  {
    top=top+1;
    stack[top]=ele;
    System.out.println("stack to be inserted:"+stack[top]);
   }
  void pop()
  {
    System.out.println("stack to be deleted :"+stack[top]);
    top=top-1;
   }
 
  void show()
  {
   if(top==-1)
   {
    System.out.println("stack is empty");
   }
   else
   {
    int i;
    for(i=top;i>=0;i--)
    {
     System.out.println(stack[i]);
    }
   }
  }
  public static void main(String[] args)
  {
    S ob = new S();
    while(1!=0)
   {
    Scanner sc =  new Scanner(System.in);
    int choice = sc.nextInt();
    switch(choice)
    {
     case 1:
         int x = sc.nextInt();
         ob.push(x);
         break;
    case 2:
         ob.pop();
         break;
    case 3:
         ob.show();
         break;
    case 4:
         System.out.println("exit");
    default:
         System.out.println("Invalid choice");
    }
  }
 }

}

