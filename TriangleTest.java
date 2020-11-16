import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TriangleTest {

    @Test(timeout = 2)
    public void testCalculatePerimeterWhenSidesPositiveAndNonZeroThenSumOfSides() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expected = 3 + 4 + 5;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("Perimeter calculation is wrong", expected, actual, 0.000001);
    }

    @Test(timeout = 2)
    public void testCalculatePerimeterWhenSidesNegativeAndNonZeroThenZero() {
        Triangle triangle = new Triangle(-3, 4, 5);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("Perimeter of non-existant triangle should be zero.", expected, actual, 0.000001);
    }

    @Test
    public void testCalculateAreaWhenPositiveNumbersThenPositiveResult() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expected = 6;
        double actual = triangle.calculateArea();

        Assert.assertEquals("Area should be correct.", expected, actual, 0.0001);
    }

    @Test
    public void testIsEquilateralWhenTrue() {
        Triangle triangle = new Triangle(4, 4, 4);

        assertTrue("Triangle should be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenTwoSidesAreEqualThenFalse() {
        Triangle triangle = new Triangle(4, 4, 7);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenOtherTwoSidesAreEqualThenFalse() {
        Triangle triangle = new Triangle(7, 4, 4);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenAllSidesAreNotEqualThenFalse() {
        Triangle triangle = new Triangle(3, 4, 5);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsIsoscelesWhenTwoSidesAreEqualThenTrue(){
        Triangle triangle = new Triangle(4, 4, 7);

        assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesWhenOtherTwoSidesAreEqualThenTrue(){
        Triangle triangle = new Triangle(7, 4, 4);

        assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesWhenAllSidesAreEqualThenTrue(){
        Triangle triangle = new Triangle(4, 4, 4);

        assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    // additional test
    @Test
    public void testIsIsoscelesWhenBSideIsDifferentThenTrue() {
        Triangle triangle = new Triangle(4,7,4);
        assertTrue("Triangle should be isosceles", triangle.isIsosceles());
    }

    @Test
    public void testIsRightWhenSidesAreNotEqualsThenFalse() {
        Triangle triangle = new Triangle(4,7,3);
        Assert.assertFalse("Triangle is not right", triangle.isRight());
    }

    @Test
    public void testIsRightWhenTwoSidesAreNotEqualToThirdThenFalse() {
        Triangle triangle = new Triangle(5,3,5);
        Assert.assertFalse("Triangle is not right", triangle.isRight());
    }

    // Im not sure that this is correct @Test. I don't know how to check isRight method.
    @Test
    public void testIsRightWhenAllSidesAreSameThenTrue() {
        Triangle triangle = new Triangle(5,5,5);
        Assert.assertTrue("Triangle is not right", triangle.isRight());
    }
}
