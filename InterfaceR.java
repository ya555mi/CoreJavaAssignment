interface Radius1
{
	Shapes shapes=new Shapes();
	default double diameter() 
     {
return 2*shapes.getRadius();
	}

}
