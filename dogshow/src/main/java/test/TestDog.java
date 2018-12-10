package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Scanner;

import org.junit.Test;

import dogShow.DogShow;

public class TestDog {
	
	@Test
	public void testOutput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Test Dog Placement: ");
		int myDog = scan.nextInt();
		//int position = scan.nextInt();
		
		assertEquals("This is incorrect", myDog , DogShow.DogPosition(myDog, 10));
		
	}

}
