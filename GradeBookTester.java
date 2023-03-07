import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {

	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	
	@BeforeEach
	public void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		gradeBook1.addScore(50);
		gradeBook1.addScore(75);
		gradeBook2.addScore(50);
		gradeBook2.addScore(80);
		gradeBook2.addScore(65);
		gradeBook2.addScore(45);
	}

	@AfterEach
	public void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(gradeBook1.toString().equals("50.0 75.0 "));
		assertTrue(gradeBook2.toString().equals("50.0 80.0 65.0 45.0 "));
	}

	@Test
	public void testGetScore() {
		assertEquals(2, gradeBook1.getScoreSize(),0.1);
		assertEquals(4, gradeBook2.getScoreSize(),0.1);
	}
	
	@Test
	public void testSum() {
		assertEquals(125, gradeBook1.sum(), .0001);
		assertEquals(240, gradeBook2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, gradeBook1.minimum(), .001);
		assertEquals(45, gradeBook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75.0, gradeBook1.finalScore(), .01);
		assertEquals(195.0, gradeBook2.finalScore(), .01);
	}

	

}
