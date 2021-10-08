import java.util.*;
class ShapeCalculator
{
	
public static void main(String as[])
{
	while(true){
System.out.println("--shape Menu----");	
System.out.println("Enter 1 for :Circle");	
System.out.println("Enter 2 for :Square");	
System.out.println("Enter 3 for :Sphere");	
System.out.println("Enter 4 for :Triangle");
System.out.println("Enter 5 for :Exit");
try{
Scanner scanner=new Scanner(System.in);

int value=scanner.nextInt();
switch(value)
{
case 1:
Circle circle=new Circle();
System.out.println("Area of the AreaOfCircle = " +circle.areaOfCircle());
System.out.println("Area of the CircumferenceOfCircle = " +circle.circumferenceOfCircle());
System.out.println("Area of the DiameterOfCircle = " +circle.diameter());
break;	
case 2:
Square square=new Square();

System.out.println("Area of the AreaOfSquare = " +square.areaOfSquare());
System.out.println("Area of the CircumferenceOfSquare = " +square.circumferenceOfSquare() );
System.out.println("Area of the DiagonalOfSquare = " +square.diagonalOfSquare() );
System.out.println("Area of the PerimeterOfSquare = " +square.circumferenceOfSquare() );
System.out.println("Area of the VolumeOfSquare = " +square.volumeOfSquare() );
break;
case 3:
Sphere sphere=new Sphere();
System.out.println("Area of the AreaOfSphere = " +sphere.areaOfSphere() );
System.out.println("Area of the CircumferenceOfSphere = " +sphere.circumferenceOfSphere());
System.out.println("Area of the DiameterOfCircle = " +sphere.diameter());

System.out.println("Area of the PerimeterOfSquare = " +sphere.circumferenceOfSphere() );
System.out.println("Area of the VolumeOfSquare = " +sphere.volumeOfSphere() );
break;
case 4:
Triangle triangle=new Triangle();
System.out.println("Area of the AreaOfTriangle = " +triangle.areaOfTriangle());
System.out.println("Area of the AreaOfPerimeter = " +triangle.areaOfPerimeter());
break;
case 5:
System.exit(1);
}
}
catch(InputMismatchException inputMismatchException){System.out.println("Null not allowed here : Enter Valid value");}
}
}	
}