import java.util.*;
class AccountOverdrawSafeDemo  extends Thread
{	
static Account account=new Account();//account class object
private int withdrawAmount;
private String name;
AccountOverdrawSafeDemo(String name,int withdrawAmount)
{
this.withdrawAmount=withdrawAmount;
this.name=name;	
}
//thread class run method
	public void run()
	{
		account.withdraw(name,withdrawAmount);
	}
public static void main(String as[])
{
	Scanner scanner=new Scanner(System.in);
	try
	{
	//first Holder details
	System.out.println("enter Firstholder name");
	String firstHolderName=scanner.next();
	System.out.println("enter withdraw amount");
	int withdrawAmount1=scanner.nextInt();
	//second Holder details
	System.out.println("enter Secondholder name");
	String secondHolderName=scanner.next();
	System.out.println("enter withdraw amount");
	int withdrawAmount2=scanner.nextInt();
	//create first thread
    AccountOverdrawSafeDemo accountOverdrawDemoFirst=new AccountOverdrawSafeDemo(firstHolderName,withdrawAmount1);
    accountOverdrawDemoFirst.start();
	//create second thread
    AccountOverdrawSafeDemo	accountOverdrawDemoSecond=new AccountOverdrawSafeDemo(secondHolderName,withdrawAmount2);
    accountOverdrawDemoSecond.start();
	}
	catch(InputMismatchException inputMismatchException)
	{
		System.out.println("please enter valid input");
	}
	}
	}
