import java.util.*;
class Circle implements Radius1
{
	Scanner scanner=new Scanner(System.in);
	Shapes shapes=new Shapes();
 Circle()
 {
 System.out.println("Enter radius :Circle");	
 double circleRadius=scanner.nextDouble();
 shapes.setRadius(circleRadius);
 }
  double areaOfCircle()
   {
return Math.PI * Math.pow(shapes.getRadius(), 2);
	}
	 double circumferenceOfCircle()
     {
    return Math.PI * (2 * shapes.getRadius());
	}

}