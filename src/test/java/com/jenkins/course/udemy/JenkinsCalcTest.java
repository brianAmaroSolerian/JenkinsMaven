package com.jenkins.course.udemy;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;


public class JenkinsCalcTest {

	@Test
	public void addtest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.add(5, 5));
	}
	
	@Test
	public void subtest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(0, myCalc.sub(5, 5));
	}

}
