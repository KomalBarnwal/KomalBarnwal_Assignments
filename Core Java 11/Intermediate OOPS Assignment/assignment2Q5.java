class Line extends Shape4{
    @Override
    public String draw() {
    	String line = new String("Drawing Line.");
    	System.out.println(line);
    	return line;
    }
}

class Rectangle extends Shape4 {
    @Override
    public String draw() {
    	String rectangle = new String("Drawing Rectangle.");
    	System.out.println(rectangle);
    	return rectangle;
    }
}

class Circle extends Shape4 {
    @Override
    public String draw() {
    	String circle = new String("Drawing Circle.");
    	System.out.println(circle);
    	return circle;
    }
}

class Cube extends Shape4 {
    @Override
    public String draw() {
    	String cube = new String("Drawing Cube.");
    	System.out.println(cube);
    	return cube;
    }
}
abstract class Shape4 {
    abstract public String draw();
}
public class assignment2Q5 {
	public static void main(String[] args) {
		
		Shape4 line = new Line();
		line.draw();
		
		Shape4 rectangle  = new Rectangle();
		rectangle.draw();
		
		Shape4 circle = new Circle();
		circle.draw();
		
		Shape4 cube = new Cube();
		cube.draw();

	}

}