/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import JavaShapesDemo.Shapes;

/**
 *
 * @author josie
 */
public class ShapesJUnitTest {
    
    public ShapesJUnitTest() {
    }
    
    private Shapes shapes;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        shapes = new Shapes();
    }
    
    @After
    public void tearDown() {
    }
     
    @Test
    public void testTriangleShape() {
        Shapes.Triangle t = shapes.new Triangle();
        double t_area = t.getArea();
        assertEquals(4.0, t_area, 0.001);
        double t_perimeter = t.getPerimeter();
        assertEquals(9.0, t_perimeter, 0.001);
    }
     
    @Test
    public void testCircleShape(){
        Shapes.Circle c = shapes.new Circle();
        double c_area = c.getArea();
        assertEquals(50.27, c_area, 0.01);
        double c_perimeter = c.getPerimeter();
        assertEquals(25.13, c_perimeter, 0.01);
    }
     
    @Test
    public void testRectangleShape() {
        Shapes.Rectangle r = shapes.new Rectangle();
        double r_area = r.getArea();
        assertEquals(12.56, r_area, 0.001);
        double r_perimeter = r.getPerimeter();
        assertEquals(16.0, r_perimeter, 0.001);
    }
    
    @Test
    public void testSquareShape() {
        Shapes.Square s = shapes.new Square();
        double s_area = s.getArea();
        assertEquals(16.0, s_area, 0.1);
        double s_perimeter = s.getPerimeter();
        assertEquals(16.0, s_perimeter, 0.1);
    }
    
    @Test
    public void testEllipseShape() {
        Shapes.Ellipse e = shapes.new Ellipse();
        double e_area = e.getArea();
        assertEquals(62.8, e_area, 0.1);
        double e_perimeter = e.getPerimeter();
        assertEquals(28.4, e_perimeter, 0.1);
    }
}
