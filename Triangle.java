import java.util.*;
class Triangle
{
Scanner scanner=new Scanner(System.in);
Shapes shapes=new Shapes();
Triangle()
{
System.out.println("Enter width :Triangle");	
 double triangleWidth=scanner.nextDouble();
 shapes.setWidth(triangleWidth);
 
 System.out.println("Enter height :Triangle");	
 double triangleHeight=scanner.nextDouble();
 shapes.setHeight(triangleHeight);
 
  System.out.println("Enter base length :Triangle");	
 double triangleLength=scanner.nextDouble();
 shapes.setLength(triangleLength);
 
  System.out.println("Enter firstSide :Triangle");	
 double triangleFirstSide=scanner.nextDouble();
 shapes.setFirstSide(triangleFirstSide);
 
  System.out.println("Enter secondSide :Triangle");	
 double triangleSecondSide=scanner.nextDouble();
 shapes.setSecondSide(triangleSecondSide);
 
}	

 double areaOfTriangle() 
{
return shapes.getWidth()*shapes.getHeight()/2;
	}	
	
	 double areaOfPerimeter() 
{
return shapes.getFirstSide()+shapes.getLength()+shapes.getSecondSide();
	}	
}
