import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;  
//class Student implements Serializable interface
public class Student implements Serializable
{
	//Student class constructor initialize instance variable
	String firstName;
	Date dateOfBirth;
	Address address;//creating Address class reference variable to store object of Address class.
	Student(String firstName,Date dateOfBirth,Address address){
this.firstName=firstName;
this.dateOfBirth=dateOfBirth;
this.address=address;
	}
	//toString method print the object of the student class
	public String toString(){
		return "firstName="+firstName+"\ndateOfBirth="+dateOfBirth;
	}
}
class Address implements Serializable
{
private	String city;
private	String state;
private	int pinCode;
private	String country;
	//Student class constructor initialize instance variable
	Address(String city,String state,int pinCode,String country)
	{
this.city=city;
this.state=state; 
this.pinCode=pinCode; 
this.country=country; 	
	}
	//toString method print the object of the Address class
public String toString(){
		return "\ncity="+city+"\nstate="+state+"\npinCode="+pinCode;
	}	
	}