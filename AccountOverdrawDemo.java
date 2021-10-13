import java.util.*;
import java.io.*;
class AccountOverdrawDemo  extends Thread
{
static Account account=new Account();
private int withdrawAmount;
private String name;
AccountOverdrawDemo(String name,int withdrawAmount)
{
this.withdrawAmount=withdrawAmount;
this.name=name;	
}
	public void run()
	{
		account.withdraw(name,withdrawAmount);
	}
public static void main(String as[])
{
	try{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter Firstholder name");
	String firstHolderName=scanner.nextLine();
	System.out.println("enter withdraw amount");
	int withdrawAmount1=scanner.nextInt();
	System.out.println("enter Secondholder name");
	String secondHolderName=scanner.nextLine();
	System.out.println("enter withdraw amount");
	int withdrawAmount2=scanner.nextInt();
    AccountOverdrawDemo	accountOverdrawDemoFirst=new AccountOverdrawDemo(firstHolderName,withdrawAmount1);
    accountOverdrawDemoFirst.start();
    AccountOverdrawDemo	accountOverdrawDemoSecond=new AccountOverdrawDemo(secondHolderName,withdrawAmount2);
    accountOverdrawDemoSecond.start();
	}
	catch(InputMismatchException inputMismatchException)
	{
		System.out.println("please enter valid input");
	}
	}
}
