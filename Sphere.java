import java.util.*;

class Sphere implements Radius1
{
Scanner scanner=new Scanner(System.in);
Shapes shapes=new Shapes();
Sphere()
{
 System.out.println("Enter radius :Sphere");
double sphereRadius=scanner.nextDouble();
shapes.setRadius(sphereRadius);
}
 double areaOfSphere() {

		return 4*Math.PI * Math.pow(shapes.getRadius(), 2);
	}	
	 double circumferenceOfSphere() {

		return 2*Math.PI*shapes.getRadius();
	}
	 
double volumeOfSphere() {
return 4/3*Math.PI*Math.pow(shapes.getRadius(),3);
	}	
}