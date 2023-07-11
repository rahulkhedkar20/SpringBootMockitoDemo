package com.mocitoDemo1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class YourClassTest {

	@Test
	public void testVoidMethod() {

		// Create a mock object of YourClass
		YourClass yourObject = Mockito.mock(YourClass.class);

		// Scenario 1: Void method with no exception
		// Use doNothing to define the behavior of the void method
		Mockito.doNothing().when(yourObject).voidMethod();

		// Call the void method
		yourObject.voidMethod();

		// Verify that the method was called
		Mockito.verify(yourObject).voidMethod();

		// Scenario 2: Void method throwing an exception
		// Use doThrow to define the behavior of the void method
		Mockito.doThrow(RuntimeException.class).when(yourObject).voidMethod();

		// Call the void method (which throws an exception)
		// You can handle the exception as per your test requirements
		try {
			yourObject.voidMethod();
		} catch (RuntimeException e) {
			// Handle the exception or perform assertions
		}

		// Verify that the method was called
		Mockito.verify(yourObject, Mockito.times(2)).voidMethod();
		
	}
}
