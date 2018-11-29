package rcpTest;

import static org.junit.Assert.*;

import org.junit.Test;

import rcp.RPS;

	///////////
	// 1 = ROCK
	// 2 = PAPER
	// 3 = SCISSORS
	// 4 = Lizard
	// 5 = Spock
	
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
	@Test
	public void LizardTest1()
	{
		int result = RPS.play(4,2); //player = Lizard, comp = Paper
		
		assertEquals("Player did not win (Lizard vs Paper",3,result);
	}
	@Test
	public void LizardTest2()
	{
		int result = RPS.play(4,1); //player = Lizard, comp = Rock
		
		assertEquals("Computer did not Win",1,result);
	}
	@Test
	public void SpockTest1()
	{
		int result = RPS.play(5,3); //player = Spock, comp = Scissors
		
		assertEquals("Player did not Win",3,result);
	}
	@Test
	public void SpockTest2()
	{
		int result = RPS.play(5,2); //player = Spock, comp = Paper
		
		assertEquals("Computer did not Win",1,result);
	}
}


