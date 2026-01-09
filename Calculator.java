import java.util.Scanner;
class MiniProject
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int choice;
do
{
System.out.println("_______MENU DRIVEN CALCULATOR_______");
System.out.println("1.Addition");
System.out.println("2.Substraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Modulus");
System.out.println("6.Exit");
System.out.println("Enter your choice:");

choice=sc.nextInt();

if(choice>=1 && choice<=5)
{
System.out.println("Enter first number:");
int num1=sc.nextInt();
System.out.println("Enter second number:");
int num2=sc.nextInt();

switch(choice)
{
case 1:
	
System.out.println("Result (Addition)=" +(num1+num2));
break;

case 2:

System.out.println("Result (Substraction)=" +(num1-num2));
break;

case 3:

System.out.println("Result (Multiplication)=" +(num1*num2));
break;

case 4:
	{
	if(num2==0)
		System.out.println("Enter a number other than zero:");
	 num2=sc.nextInt();
	}

System.out.println("Result (Division)=" +(num1/num2));
break;


case 5:

System.out.println("Result (Modulus)=" +(num1%num2));
break;
}
}

else if(choice==6)
{
System.out.println("Exiting the calculator....Thank You!");
}
}
while(choice!=6);
	sc.close();
}
}
