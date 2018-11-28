package rcpTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rcp.RPS;

	///////////
	// 1 = ROCK
	// 2 = PAPER
	// 3 = SCISSORS
	
public class RPSTest 
{
	@Test
	public void pwinTest1()
	{
		int result = RPS.play(1,3); //player = rock, comp = scissors
		
		assertEquals("Player did not win (rock vs scissors)",1,result);
	}
	@Test
	public void pwinTest2()
	{
		int result = RPS.play(3,2); //player = Scissors, comp = Paper
		
		assertEquals("Player did not win (Scissors vs Paper)",1,result);
	}
	@Test
	public void pwinTest3()
	{
		int result = RPS.play(2,1); //player = Paper, comp = Rock
		
		assertEquals("Player did not win (Paper vs Rock)",1,result);
	}
	
	
	@Test
	public void cwinTest1()
	{
		int result = RPS.play(3,1); //player = Scissor, comp = Rock
		
		assertEquals("Computer did not win (rock vs scissors)",3,result);
	}
	
	@Test
	public void DrawTest1()
	{
		int result = RPS.play(2,2); //player = Paper, comp = Paper
		
		assertEquals("Not a Draw",2,result);
	}
}


