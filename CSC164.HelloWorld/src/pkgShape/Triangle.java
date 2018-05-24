package pkgShape;

public class Triangle {

	private double s1;//these are attrabutes
	private double s2;
	private double s3;
	
	public Triangle(double side1, double side2, double side3) throws Exception //triangle creator
	{
		this.s1=side1;
		this.s2=side2;
		this.s3=side3;
		
		if (SquareArea()<0) {
			throw new Exception("Illegal Triangle"); 
			//stops a triangle with negative side from getting through
		}
	}
	public Triangle (double side)//using 3 side method for equalateral triangle

	{
		this.s1=side;
		this.s2=side;
		this.s3=side;
	}
	
	public Triangle(double side2, float angle, double side3)
	{
		double s3 = ((side2*side2)+(side3*side3)-(2*side2*side3))*Math.cos((double)angle);
	
		this.s1=side2;
		this.s2=side3;
		this.s3=Math.sqrt(s3);
	}
	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}
	public double getS3() {
		return s3;
	}
	public void setS3(double s3) {
		this.s3 = s3;
	}
	
	
	public double AngleA()
	{// this is the angle between side 2 and side 3
		double a =(this.s2*this.s2)+(this.s3*this.s3)-(this.s1*this.s1)/(2*this.s2*this.s3);
		
		return Math.acos(a)*(180/Math.PI);
				
	
	}
	
	public double AngleB()
	{
	//this is the angle between side 1 and 3
		
		double b =(this.s3*this.s3)+(this.s1*this.s1)-(this.s2*this.s2)/(2*this.s3*this.s1);
		
		return Math.acos(b)*(180/Math.PI);
		
	}
	
	public double AngleC()
	{
		
		double c =(this.s1*this.s1)+(this.s2*this.s2)-(this.s3*this.s3)/(2*this.s1*this.s2);
		
		return Math.acos(c)*(180/Math.PI);
		
	//this is the angle between side 1 and 2
	}
	
	//now we will find the perimeter and area of the triangle
	
	public double Perimeter()
	{
		return s1+s2+s3;
	}
	private double HalfPerimeter()
	//this is private because nobody needs to know this, they only need to know the perimeter and the area
	{
		return Perimeter()/2;
	}
	private double SquareArea()
	{
		return
				this.HalfPerimeter()*(this.HalfPerimeter()-this.s1)*(this.HalfPerimeter()-this.s2)*(this.HalfPerimeter()-this.s3);	
	}
	public boolean AreSidesEqual()
	{
		boolean isEqual = false;
		
		if (this.s1 == this.s2)&&(this.s1==this.s3)&&(this.s2==this.s3);
	}
}
