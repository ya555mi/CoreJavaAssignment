import java.io.*;

class DeserializationTest{

public static void main(String as[])throws Exception
{
	
	FileInputStream fo1=new FileInputStream("OutPut2.ser");
// FileInputStream fo1=new FileInputStream("OutPut1.ser");
ObjectInputStream ob1=new ObjectInputStream(fo1);
Student student=(Student)ob1.readObject();
System.out.print(student);
System.out.println(student.address);

}
}