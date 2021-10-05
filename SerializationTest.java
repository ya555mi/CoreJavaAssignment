import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;  
import java.text.ParseException;  
class SerializationTest{
public static void main(String as[])throws ParseException,IOException
{
	//Studnet
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Name:");
	String firstName=sc.next();
	System.out.println("Enter DateOFBirth dd/MM/yyyy:");
	String DOB=sc.next();
  
	//Address
	System.out.println("Enter City:");
	String city=sc.next();
	System.out.println("Enter State:");
	String state=sc.next();
	System.out.println("Enter Pincode:");
	int pinCode=sc.nextInt();
	System.out.println("Enter Conutry:");
	String country=sc.next();
     Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(DOB);
	Student student=new Student(firstName,date1,new Address(city,state,pinCode,country));	
	//using try-with-resources
  try(FileOutputStream fos=new FileOutputStream("OutPut2.ser"); ObjectOutput obs=new ObjectOutputStream(fos)){
// FileOutputStream fo=new FileOutputStream("OutPut1.ser");
obs.writeObject(student);
}
}}