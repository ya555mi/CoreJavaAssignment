import java.util.*;
class Square
{

Scanner scanner=new Scanner(System.in);
Shapes shapes=new Shapes();

 Square()
 {
  System.out.println("Enter side_Length :Square");
  double side_Length=scanner.nextDouble();
 shapes.setLength(side_Length);
}
  double areaOfSquare() 
   {
 return Math.pow(shapes.getLength(), 2);
	}
  double circumferenceOfSquare() 
   {
   return 4*shapes.getLength();
	}
	 double diagonalOfSquare() 
    {
   return shapes.getLength()*Math.sqrt(2);
	}
  double volumeOfSquare() 
   {
		return Math.pow(shapes.getLength(),3);
	}
 }