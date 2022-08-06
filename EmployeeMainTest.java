package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeMainTest {
	EmployeeBusinessLogic empbl;

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	//Positive test run
//		@Test
//		@DisplayName("Test the yearly salary method")
//		void testCalculateYearlySalary() {
//			empbl=new EmployeeBusinessLogic();
//			assertEquals(24000, empbl.calculateYearlySalary(2000));
//			
//		}
	
	//Negative test run
		@Test
		@DisplayName("Test the yearly salary method")
		void testCalculateYearlySalary() {
			empbl=new EmployeeBusinessLogic();
			assertEquals(24000, empbl.calculateYearlySalary(3000));
			
		}
	
	//Positive test run
//		@Test
//		@DisplayName("Test the Appraisal method")
//		void testCalculateAppraisal() {
//			empbl=new EmployeeBusinessLogic();
//			//empbl.calculateAppraisal(25000);
//			assertEquals(1000, empbl.calculateAppraisal(25000));
//			
//		}
		
	//Negative test run
		@Test
		@DisplayName("Test the Appraisal method")
		void testCalculateAppraisal() {
			empbl=new EmployeeBusinessLogic();
			//empbl.calculateAppraisal(25000);
			assertEquals(500, empbl.calculateAppraisal(25000));
			
		}
	
	

}
