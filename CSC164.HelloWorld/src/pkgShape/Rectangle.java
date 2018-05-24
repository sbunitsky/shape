package pkgShape;

public class Rectangle {
	
	public int Length;
	public int Width;
	
	public Rectangle(int Width, int Length){
		
		this.Length = Length;
		this.Width = Width;
	}

	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public double Area() {
		return (double) Length*Width;
	}
	
	public double Perimeter() {
		return (double) (2*Length)+(2*Width);
	}
	
	public boolean isSquare() 
	{
		return (this.Width==this.Length);//returns true and false statement with out all the extra code. 
	}
	public boolean AreSidesEqual()
	{
		return isSquare();
	}
}
