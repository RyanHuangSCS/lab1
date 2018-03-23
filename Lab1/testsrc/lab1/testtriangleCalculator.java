package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testtriangleCalculator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsLegal() {
		assertEquals(true,triangleCalculator.isLegal(3, 4, 5));//合法数据
		assertEquals(false,triangleCalculator.isLegal(-2, 3, 1));//任意一个小于0
		assertEquals(false,triangleCalculator.isLegal(2, -3, 1));
		assertEquals(false,triangleCalculator.isLegal(2, 3, -1));
		assertEquals(false,triangleCalculator.isLegal(12, 3, 6));//a过长
		assertEquals(false,triangleCalculator.isLegal(2, 13, 6));//b过长
		assertEquals(false,triangleCalculator.isLegal(2, 3, 16));//c过长

		
	}

	@Test
	public void testIsEquilateral() {
		assertEquals(true,triangleCalculator.isEquilateral(2, 2,2));//等边三角形
		assertEquals(false,triangleCalculator.isEquilateral(0, 0,0));//非法的数据，但是相等
		assertEquals(false,triangleCalculator.isEquilateral(3, 3, 5));//等腰三角形，非等边三角形

	}

	@Test
	public void testIsIsosceles() {
		assertEquals(true,triangleCalculator.isIsosceles(3, 3, 5));//ab相等的等腰三角形
		assertEquals(true,triangleCalculator.isIsosceles(5, 3, 3));//bc相等的等腰三角形
		assertEquals(true,triangleCalculator.isIsosceles(3, 5, 3));//ac相等的等腰三角形
		assertEquals(false,triangleCalculator.isIsosceles(3, 4, 5));//非等腰三角形
		assertEquals(true,triangleCalculator.isIsosceles(3, 3, 3));//等边三角形
		assertEquals(false,triangleCalculator.isIsosceles(-3, -3, 1));//非法数据
		
	}

	@Test
	public void testIsScalene() {
		assertEquals(true,triangleCalculator.isScalene(3, 4, 5));
		assertEquals(true,triangleCalculator.isScalene(3, 3, 5));
		assertEquals(false,triangleCalculator.isScalene(4, 4, 4));
		assertEquals(false,triangleCalculator.isScalene(-1, -2, 0));

	}

}
