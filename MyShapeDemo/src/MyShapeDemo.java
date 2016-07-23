package JavaShapesDemo;


public class MyShapeDemo {

    /**
     * This program will calculate the area and the perimeter
     * 
     * There are 5 classes that implements the Shape interface:
     * Triangle, Circle, Rectangle, Ellipse and Square
     * 
     * For a triangle where base is 2 and height is 4 and the three sides of
     * the triangle is 2, 3, and 4
     * 
     * For a square:
     * Area/Perimeter -> length is 4
     * 
     * Note: Hard coding values is typically bad, but the purpose of this
     * test is to demonstrate Java interface and how to implement them
     */
    public static void main(String[] args) {
        Shapes testShapes = new Shapes();
        Shapes.Triangle t = testShapes.new Triangle();
        t.getArea();
        t.getPerimeter();

        Shapes.Square s = testShapes.new Square();
        s.getArea();
        s.getPerimeter();
    }
    
}
