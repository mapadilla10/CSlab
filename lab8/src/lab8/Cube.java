package lab8;
/*Marko Padilla
 * CS lab 
 * Lab 8 - this lab implemented the use of bubble and selection sorting, then test to see which one is faster.
 * 4/4/2018
 */
public class Cube {

	public double length;
	public double width;
	public double height;

//getters and setters
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public Cube(double l, double w, double h)
	{
		this.length = l;
		this.width  = w;
		this.height = h;
	}
	//method for volume 
	public double getVolume()
	{
		double vol = this.length * this.width * this.height;

		return vol;
	}	

}
