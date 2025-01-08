package in.precprograminjava;

public class Rectangle {

	float height;
	float width;
	public Rectangle() {
		height=1F;
		width=1F;
		
	}
	public Rectangle(float height,float width) {
		this.height=height;
		this.width=width;
		
	}
	//to define a method
	//Access-modifier<modifier>return-type method-name(<parameter>)<throw>{}

public void setHeight(float height){
	this.height=height;
	
}
public  void setWidth(float width) {
	this.width=width;
}
public float getheight() {
	return height;
	
}
public float getWidth() {
	return width;
}
public float calculateArea() {
	return width*height;

}
}
