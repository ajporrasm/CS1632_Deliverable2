package com.laboon;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test program modifications
 */

public class NewFeaturesTest 
{


	/**
	 * Basic stub method
	 * Program executor is started and if step is set to false, do nothing
	 * @return program stack peek()
	 */

	public static int stubPeek(String input) 
	{
		ProgramExecutor _pe = new ProgramExecutor(new MainPanel(), new ProgramStack(), new ProgramArea(input));

		while (_pe.step() == false) 
		{
			//do nothing
		}

		return _pe._ps.peek();
	}

	/**
	 * Basic stub method
	 * Program executor is started and if step is set to false, do nothing
	 * @return program stack pop()
	 */
	
	public static int stubPop(String input) 
	{
		ProgramExecutor _pe = new ProgramExecutor(new MainPanel(), new ProgramStack(), new ProgramArea(input));

		while (_pe.step() == false) 
		{
			//do nothing
		}

		return _pe._ps.pop();
	}
	
	
	/** 
	 * Basic mock
	 * Program executor is started and if step is set to false, nothing happens
	 * @return program stack peek()
	 */ 

	public static int mockPeek(String input) 
	{
		//should I return a mock class as the mock for testing? I was not completely sure on how to make a mock
		ProgramExecutor _pe = new ProgramExecutor(new MainPanel(), new ProgramStack(), new ProgramArea(input));		 
		_pe.run(10);
		return _pe._ps.peek();

	}
	
	

	/** 
	 * Basic mock
	 * Program executor is started and if step is set to false, nothing happens
	 * @return program stack pop()
	 */ 

	public static int mockPop(String input) 
	{
		
		ProgramExecutor _pe = new ProgramExecutor(new MainPanel(), new ProgramStack(), new ProgramArea(input));		 
		_pe.run(10);
		return _pe._ps.pop();

	}


	/** 
	 * Asserts that the incremental function works properly
	 * stub method is incremented 3 times and asserts equals 
	 */

	@Test
	public void testIncrementStubPeek() 
	{
		assertEquals(3, stubPeek("iiit@"));
	}

	/** 
	 * Asserts that the Decremental function works properly
	 * mock is decremented 3 times and asserts equals to 0
	 */

	@Test
	public void testDecrementMockPeek() 
	{
		assertEquals(0, mockPeek("dddt@"));
	}

	/** 
	 * Asserts that incrementing then decrementing works properly
	 * stub method is incremented then decremented and asserts equals to 0
	 */

	@Test
	public void testIncrementDecrementStubPeek() 
	{
		assertEquals(0, stubPeek("id@"));
	}

	/** 
	 * Asserts that incrementing then decrementing works properly
	 * mock is incremented then decremented and asserts equals to 0
	 */

	@Test
	public void testIncrementDecrementMockPeek() 
	{
		assertEquals(0, mockPeek("id@"));
	}


	/** 
	 * Asserts that incrementing then decrementing repeatedly and outputting counter value works properly
	 * mock is incremented then decremented three times and asserts equals to 0
	 */

	@Test
	public void testIncrementDecrementOutputCounterMockPeek() 
	{
		assertEquals(0, mockPeek("ididid@"));
	}

	/** 
	 * Asserts that incrementing then decrementing repeatedly and outputting counter value works properly
	 * stub method is incremented then decremented three times and asserts equals to 0
	 */

	@Test
	public void testIncrementDecrementOutputCounterStubPeek() 
	{
		assertEquals(0, stubPeek("ididid@"));
	}

	/** 
	 * Asserts that reverse function works properly
	 * Mock should be equal to 3 when stack is peeked
	 */

	@Test
	public void testReverseInt() 
	{
		assertEquals(3, mockPeek("321r@"));
	}

	/** 
	 * Asserts that reverse then reverse function works properly
	 * Mock should be equal to 1 when stack is peeked
	 */

	@Test
	public void testReverseReverse() 
	{
		assertEquals(1, mockPeek("321rr@1"));
	}

	/** 
	 * Asserts that comment function works properly
	 * Mock should be equal to 1 when stack is peeked
	 */

	@Test
	public void testComment() 
	{
		assertEquals(1, mockPeek("(comment)1@"));
	}

	/** 
	 * Asserts that comment with reverse function works properly
	 * Mock should be equal to 3 when stack is peeked
	 */

	@Test
	public void testCommentReverse() 
	{
		assertEquals(3, mockPeek("3(comment)1r@"));
	}

	/** 
	 * Asserts that reverse function with multiple comments works properly
	 * Mock should be equal to 3 when stack is peeked
	 */

	@Test
	public void testCommentReverseReverse() 
	{
		assertEquals(3, mockPeek("(comment)3(comment)1r@"));
	}

	/**
	 * Asserts that mock peek works with strings
	 * Mock should be equal to 0 when stack is peeked
	 */

	@Test
	public void testStringMockPeek() 
	{
		assertEquals(0, mockPeek("64+\"noobaL\">:#,_@"));
	}

	/**
	 * Asserts that stub peek works with strings
	 * stub method should be equal to 0 when stack is peeked
	 */

	@Test
	public void testStringStubPeek() 
	{
		assertEquals(0, stubPeek("64+\"noobaL\">:#,_@"));
	}
	
	
	  
	/**
	 * Asserts that mock pop works with strings
	 * Mock should be equal to 0 when stack is peeked
	 */

	@Test
	public void testStringStubPop() 
	{
		assertEquals(0, stubPop("64+\"noobaL\">:#,_@"));
	}
	
	/**
	 * Asserts that mock pop works with strings
	 * Mock should be equal to 0 when stack is peeked
	 */

	@Test
	public void testStringMockPop() 
	{
		assertEquals(0, mockPop("64+\"noobaL\">:#,_@"));
	}
	
	/** 
	 * Asserts that comment followed by comment  works properly
	 * Mock should be equal to 0 when stack is peeked
	 */

	@Test
	public void testCommentComment() 
	{
		assertEquals(0, mockPeek("(comment)(comment)@"));
	}
	  
	/** 
	 * Asserts that comment followed by comment and a reverse works properly
	 * Mock should be equal to 0 when stack is peeked
	 */

	@Test
	public void testCommentCommentReverse() 
	{
		assertEquals(0, mockPeek("(comment)(comment)r@"));
	}
	
	/** 
	 * Asserts that comment followed by comment and a reverse works properly for stub peek
	 * stub should be equal to 0 when stack is peeked
	 */

	@Test
	public void testCommentCommentReverseStubPeek() 
	{
		assertEquals(0, stubPeek("(comment)(comment)r@"));
	}
	
	
	/** 
	 * Asserts that comment followed by comment and a reverse works properly for stub pop
	 * stub pop should be equal to 0 when stack is popped
	 */

	@Test
	public void testCommentCommentReverseStubPpop() 
	{
		assertEquals(0, stubPop("(comment)(comment)r@"));
	}
	
	/** 
	 * Asserts that comment followed a reverse then comment works properly 
	 * stub pop should be equal to 0 when stack is popped
	 */

	@Test
	public void testCommentReverseComment() 
	{
		assertEquals(0, stubPop("(comment)r(comment)@0"));
	}
}