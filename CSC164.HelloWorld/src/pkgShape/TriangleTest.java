package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	
	void TestTriangle() {
		
		double sides = 7;
		double angles = 60;
				
		Triangle t1 = null;
		try {
			t1=new Triangle(sides);
		}
		catch (Exception e) {
			fail("TestTriangle Failed");
		}
		
		
		assertEquals(sides,t1.getS1(),0.01);
		assertEquals(sides,t1.getS2(),0.01);
		assertEquals(sides,t1.getS3(),0.01);
		
		assertEquals(angles,t1.AngleA(),0.01,"Angle Not Equal");
		
		
		fail("Not yet implemented");
	}

	void TestTriangle_1() {
		double sides = 7;
		double angles = 60;
			
		Triangle t1 = null;
		try {
			t1=new Triangle(sides);
		}
		catch (Exception e) {
			fail("TestTriangle Failed");
		}
	}
}
