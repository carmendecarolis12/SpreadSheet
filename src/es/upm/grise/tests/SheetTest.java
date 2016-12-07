package es.upm.grise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.CircularReferenceException;
import es.upm.grise.ComputationErrorException;
import es.upm.grise.Sheet;

public class SheetTest {
	private String result = null;
	
	@Test
	public void testErrorOneDivZero() throws ComputationErrorException, CircularReferenceException{
	//arrange
	Sheet mySheet = new Sheet();	
	//act
	
	try {
		result = mySheet.evaluate("1/0");
	} catch (ComputationErrorException e) {
		//assert
		assertEquals("#Error",result);
	}	
	}
	
	@Test
	public void testIsOneNumber() throws ComputationErrorException, CircularReferenceException{
	//arrange
	Sheet mySheet = new Sheet();	
	//act
	
	try {
		result = mySheet.evaluate("a");
	} catch (ComputationErrorException e) {
		//assert
		assertEquals("#Error",result);
	}	
	}
	

}
