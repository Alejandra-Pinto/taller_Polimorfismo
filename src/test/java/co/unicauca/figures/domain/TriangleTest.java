package co.unicauca.figures.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alejandra Pinto y María Juliana Sánchez
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(1,1,1);
        double expResult = 3;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter2");
        Triangle instance = new Triangle(50,40,30);
        double expResult = 50+40+30;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter3");
        Triangle instance = new Triangle(1000,600,600);
        double expResult = 1000+600+600;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
    
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(1,1,1);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 1) * (s - 1) * (s - 1));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea2");
        Triangle instance = new Triangle(50,40,30);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 50) * (s - 40) * (s - 30));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea3");
        Triangle instance = new Triangle(1000,600,600);
        double s = instance.calculatePerimeter()/2;
        double expResult = Math.sqrt(s * (s - 1000) * (s - 600) * (s - 600));
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0);
    }
    
}
