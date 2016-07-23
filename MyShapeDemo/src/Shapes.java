package JavaShapesDemo;

import java.lang.Math;
/**
 *
 * I created nested classes to keep all the Shapes in one logical grouping.
 * Each shape has it's own implementation of getArea and get Perimeter
 */

public class Shapes {
    
    public class Triangle implements ShapeInterface {

        public double getArea() {
            double base = 2;
            double height = 4;
            double area =  (base * height)/2;
            System.out.println("This is Triangle area: " + area);
            return area;
        }
        
        public double getPerimeter() {
            double a=2,b=3,c=4; 
            double perimeter = a + b + c;
            System.out.println("This is Triangle perimeter: " + perimeter);
            return perimeter;
        }
    }
    
    public class Circle implements ShapeInterface {

        public double getArea() {
            double pi = 3.14;
            double radius = 4;
            double area =  Math.PI * radius * radius;
            System.out.println("This is Circle area: " + area);
            return area;
        }

        public double getPerimeter() {
          double length = 4;
          double perimeter = 2*Math.PI*length;
          System.out.println("This is Circle perimeter: " + perimeter);
          return perimeter;
        }
    }
    
    public class Rectangle implements ShapeInterface {

        public double getArea() {
            double length = 3.14;
            double width = 4;
            double area =  length * width;
            System.out.println("This is Rectangle area: " + area);
            return area;
        }

        public double getPerimeter() {
          double length = 4;
          double width = 4;
          double perimeter = 2*(length+width);
          System.out.println("This is Rectangle perimeter: " + perimeter);
          return perimeter;
        }

    }
    
    public class Square implements ShapeInterface {

        public double getArea() {
            double length = 4;
            double area =  length * length;
            System.out.println("This is Square area: " + area);
            return area;
        }

        public double getPerimeter() {
          double length = 4;
          double perimeter = 4*length;
          System.out.println("This is Square perimeter: " + perimeter);
          return perimeter;
        }
    }
    
    public class Ellipse implements ShapeInterface {

        public double getArea() {
            double a = 4;
            double b = 5;
            double area =  Math.PI * a * b;
            System.out.println("This is Ellipse area: " + area);
            return area;
        }

        public double getPerimeter() {
            double a = 4;
            double b = 5;
            double perimeter = 2 * Math.PI * Math.sqrt(((Math.pow(a, 2) + (Math.pow(b, 2)))/2));
            System.out.println("This is Ellipse perimeter: " + perimeter);
            return perimeter;
        }
    }

}
