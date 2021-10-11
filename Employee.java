import java.util.*;
import java.io.*;
public class Employee implements Serializable
{
int employeeId;
String name;
String emailAddress;
int age;
String dateOfBirth;
Employee(int employeeId,String name,String emailAddress,int age,String dateOfBirth)
{	
this.employeeId=employeeId;
this.name=name;
this.emailAddress=emailAddress;
this.age=age;
this.dateOfBirth=dateOfBirth;
}
  public String toString()
	{
	return employeeId+" "+name+" "+emailAddress+" "+age+" "+dateOfBirth;	
	}
}