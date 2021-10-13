class Account
{
	//totalamount
private int currentBalance=1000;
//withdraw amonut
synchronized public void withdraw(String name,int withdrawAmount)
{
if(currentBalance>withdrawAmount)
{
	System.out.println("withdraw Amount successfully");
	currentBalance=currentBalance-withdrawAmount;
	System.out.println("holder Name="+name+" currentBalance left="+currentBalance);	
}
else{
	//if your totalamount balance less then 500
	System.out.println("your totalamount less then 500");	
}
}		
}