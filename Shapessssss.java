
abstract class Shape41
{
	abstract double calArea();
}

class Rec37 extends Shape41
{
	double length;
	double width;
	
	public Rec37(double length, double width)
	{
	    this.length = length;
	    this.width = width;
	}
	
	

	@Override
	double calArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
}

class Circle87 extends Shape41
{
	double radius;
	
	public Circle87(double radius)
	{
		this.radius = radius;
	}

	@Override
	double calArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	
}

public class Shapessssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape41 r = new Rec37(4, 5);
		Shape41 c = new Circle87(6);
		
		System.out.println("Rectangle Area: " + r.calArea());
		System.out.println("Circle Area: " + c.calArea());

	}

}
