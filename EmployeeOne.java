import java.io.*;
import java.util.*;
class EmployeeOne
{
public static void main(String as[])throws IOException,ClassNotFoundException
{
	try{
    int choice=-1;
    Scanner scanner=new Scanner(System.in);
//create Employee.txt file
    File file=new File("employee.txt");
    ArrayList<Employee> arrayList=new ArrayList<>();
    ObjectOutputStream objectOutputStream=null;
    ObjectInputStream objectInputStream=null;
    ListIterator list=null;
//if file is exits then load the data in a ArrayList
if(file.isFile())
{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
}
do
{
	System.out.println("Enter 1 : to create employee data");
	System.out.println("Enter 2 : to display employee data");
	System.out.println("Enter 3 : to search employee data");
	System.out.println("Enter 4 : to Delete");
	System.out.println("Enter 5 : to Update");
	System.out.println("Enter 6 : to sort data by Employee Id on console");
	System.out.println("Enter 7 : to sort data by Employee Id in file");
	System.out.println("Enter 8 : to exit");
	System.out.println("....Enter your choice.......");
	choice=scanner.nextInt();
	switch(choice)
	{
		//Insert employee data 
	case 1:
	System.out.println("Enter how many Employee you want :");
    int numberOfStudent=scanner.nextInt();
	for(int i=0;i<numberOfStudent;i++)
	{
	System.out.print("Enter Employee Id=");
	int employeeId=scanner.nextInt();
	System.out.print("Enter Employee name=");
    String name=scanner.next();
	System.out.print("Enter Employee Email Address=");
	String emailAddress=scanner.next();
	System.out.print("Enter Employee Age=");
	int age=scanner.nextInt();
	System.out.print("Enter Employee DateOfBirth=");
	String dateOfBirth=scanner.next();
	arrayList.add(new Employee(employeeId,name,emailAddress,age,dateOfBirth));
	}
	objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
	objectOutputStream.writeObject(arrayList);
	objectOutputStream.close();
	break;
	//display employee data if file exists
	case 2:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
	System.out.println("------------------------");
	list=arrayList.listIterator();
	while(list.hasNext())
	{	
	System.out.println("\t"+list.next()+"\t");
	}
	System.out.println("------------------------");
	}
	else
	{
		System.out.println("File Not exists");	
	}
	break;
	//Search the Employee data if file exists
	case 3:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
	boolean found=false;
	System.out.println("Enter Employee Email Address");
	String emailAddress=scanner.next();
	System.out.println("------------------------");
	list=arrayList.listIterator();
	while(list.hasNext())
	{
		Employee employee=(Employee)list.next();
		if(emailAddress.equals(employee.emailAddress))
		{
	System.out.println(employee);
	found=true;
		}
	}
	if(!found)
	{
	System.out.println("Record Not Found");
	}
	System.out.println("------------------------");
	}
	else
	{
	System.out.println("File Not exists");
	}
	break;
	//Delete employee data by using emailAddress
	case 4:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
	boolean found=false;
	System.out.println("Enter Employee Email Address to delete");
	String emailAddress=scanner.next();
	System.out.println("------------------------");
	list=arrayList.listIterator();
	while(list.hasNext())
	{
		Employee employee=(Employee)list.next();
			if(emailAddress.equals(employee.emailAddress))
			{
			list.remove();
	found=true;
		}
	}
	if(found)
	{
	objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
	objectOutputStream.writeObject(arrayList);
	objectOutputStream.close();
	System.out.println("record delete successfully");
	}
    else{
	System.out.println("Record Not Found");
	}
	System.out.println("------------------------");
	}
	else
	{
	System.out.println("File Not exists");	
	}
	break;
	//Update employee data using emailAddress
	case 5:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
	boolean found=false;
	System.out.println("Enter Employee Email Address to Update");
	String emailAddress=scanner.next();
	System.out.println("------------------------");
	list=arrayList.listIterator();
	while(list.hasNext())
	{
		Employee employee=(Employee)list.next();
		if(emailAddress.equals(employee.emailAddress))
		{	
	System.out.println("Enter employee ID");
	int employeeId=scanner.nextInt();
	System.out.println("Enter employee name");
	String name=scanner.next();
	System.out.println("Enter employee age");
	int age=scanner.nextInt();
	System.out.println("Enter employee Date of Birth");
	String dateOfBirth=scanner.next();
	list.set(new Employee(employeeId,name,emailAddress,age,dateOfBirth));
	found=true;
		}
	}
	if(found)
	{
	objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
	objectOutputStream.writeObject(arrayList);
	objectOutputStream.close();
	System.out.println("record Update successfully");
	}
    else
	{
	System.out.println("Record Not Found");
	}
	System.out.println("------------------------");
	}
	else
	{
	System.out.println("File Not exists");	
	}
	break;
	//display sort data by Employee Id on console
	case 6:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close();
	 Collections.sort(arrayList,new Comparator<Employee>()
	 {
		 public int compare(Employee e1,Employee e2)
		 {
			 // return e2.employeeId - e1.employeeId;-->descending Order
			 return e1.employeeId - e2.employeeId; //-->ascending Order

		 } 
	 });
	System.out.println("------------------------");
	list=arrayList.listIterator();
	while(list.hasNext())
	System.out.println(list.next());
	System.out.println("------------------------");
	}
	else
	{
		System.out.println("File Not exists");	
	}
	break;
	// display sort data by Employee Id in File
	case 7:
	if(file.isFile())
	{
	objectInputStream=new ObjectInputStream(new FileInputStream(file));
	arrayList=(ArrayList<Employee>)objectInputStream.readObject();
	objectInputStream.close(); 
	 Collections.sort(arrayList,new Comparator<Employee>()
	 {
		 public int compare(Employee e1,Employee e2)
		 {
			 // return e2.employeeId - e1.employeeId;-->descending Order
			 return e1.employeeId - e2.employeeId; //-->ascending Order
		 } 
	 });
	 objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
	 objectOutputStream.writeObject(arrayList);
	 objectOutputStream.close();
	 System.out.println("------------------------");
	 list=arrayList.listIterator();
	 while(list.hasNext())
	 System.out.println(list.next());
	 System.out.println("------------------------");
	}
	else
	{
		System.out.println("File Not exists");	
	}
	break;
	case 8:
	System.exit(0);
	}//end switch case
}while(choice!=0);//end do-while loop
	}//try blocck
catch(InputMismatchException inputMismatchException)
{
System.out.println("Enter valid value");
}//end catch block		
}		
}
