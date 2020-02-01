import java.lang.Math;
class Triangle extends GeometricObject
{
	
	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(double side1 , double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	@Override
	public double getArea() {
		
		 double s = (side1 + side2 + side3)/2;  
		 double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); 
		
		return area;
	}

	@Override
	public double getPerimeter() {

		double perimeter = side1 + side2 +side3;
		return perimeter; 
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled +"\nTriangle:- \nside1: "+ side1 + "\nside2: "+ side2 + "\nside3: " + side3 ;

	}
}
