package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	private HomeworkAssignment myTest;
	
	@Before
	public void setup(){
		myTest = new HomeworkAssignment(100,"Robert");
	}
	@Test
	public void  assignment_initialized(){
		Assert.assertEquals(100,myTest.getPossibleMarks());
		Assert.assertEquals("Robert",myTest.getSubmitterName());

	}
	@Test
	public void set_new_name(){
		myTest.setSubmitterName("Corey");
		Assert.assertEquals("Corey", myTest.getSubmitterName());
	}
	@Test
	public void set_total_mark(){
		myTest.setTotalMarks(100);
		Assert.assertEquals(100, myTest.getTotalMarks());
	}
	@Test
	public void get_a_letter_a(){
		myTest.setTotalMarks(90);
		Assert.assertEquals("A", myTest.getLetterGrade());
	}
	@Test
	public void get_a_letter_b(){
		myTest.setTotalMarks(80);
		Assert.assertEquals("B", myTest.getLetterGrade());
	}
	@Test
	public void get_a_letter_c(){
		myTest.setTotalMarks(70);
		Assert.assertEquals("C", myTest.getLetterGrade());
	}
	@Test
	public void get_a_letter_d(){
		myTest.setTotalMarks(60);
		Assert.assertEquals("D", myTest.getLetterGrade());
	}
	@Test
	public void get_a_letter_f(){
		myTest.setTotalMarks(50);
		Assert.assertEquals("F", myTest.getLetterGrade());
	}
		
}
