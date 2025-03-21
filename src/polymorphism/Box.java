package polymorphism;

public class Box {
	
	double width, height, depth;

	Box()
	{
		width = 0;
		height = 0;
		depth = 0;

		// width=height=depth=0; // another way if values are same
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box(double len)
	{
		width = height = depth = len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
	
	

}
