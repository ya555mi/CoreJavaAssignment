import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;  

class Student implements Serializable
{
	String firstName;
	Date dateOfBirth;
	Address address;
	Student(String firstName,Date dateOfBirth,Address address){
this.firstName=firstName;
this.dateOfBirth=dateOfBirth;
this.address=address;
	}
	public String toString(){
		return "firstName="+firstName+"\ndateOfBirth="+dateOfBirth;
	}
}
class Address implements Serializable
{
	String city;
	String state;
	int pinCode;
	String country;
	
	Address(String city,String state,int pinCode,String country)
	{
this.city=city;
this.state=state; 
this.pinCode=pinCode; 
this.country=country; 	
	}
public String toString(){
		return "\ncity="+city+"\nstate="+state+"\npinCode="+pinCode;
	}	
}