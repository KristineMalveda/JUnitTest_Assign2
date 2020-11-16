package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringTest {

	// Uppgift 1
	@Test
	public void testAReversedString() {
		String word = "Jag";
		StringBuilder stringbuilder = new StringBuilder(word);
		String reversedWord = stringbuilder.reverse().toString();
		assertEquals("gaJ", reversedWord);
	}

	// Uppgift 2 
	@Test
	public void testAString() {
		String name = "My name";
		assertEquals("My name", name);
	}

	// Uppgift 3
	@Test
	public void assertFirstName() {
		String firstName = "first name";
		assertEquals("first name", firstName);
	}

	@Test
	public void assertLastName() {
		String lastName = "last name";
		assertEquals("last name", lastName);
	}

	@Test
	public void assertPhoneNumber() {
		int phoneNumber = 0701111111;
		assertEquals(0701111111, phoneNumber);
	}

	@Test
	public void assertStreetAddress() {
		String streetAddress = "my cool street";
		assertEquals("my cool street", streetAddress);
	}

	// uppgift 4
	@Test
	public void testLengthOfAString() {
		String jUnit = "Junit 5";
		int jUnitLength = jUnit.length();
		assertEquals(7, jUnitLength);
	}

	// Uppgift 5 
	@Test
	public void testANumber() {
		int number = 100;
		assertEquals(100, number);
	}

	// Uppgift 6
	@Test
	public void testStringObjectsAreSame() {
		String stringObj1 = new String("S1");
		String stringObj2 = new String("S1");
		stringObj1 = stringObj2;
		assertSame(stringObj1,stringObj2);
	}

	// Uppgift 7
	@Test
	public void testByteNumbers() {
		byte byteNum1 = 100;
		byte byteNum2 = byteNum1;
		assertTrue(byteNum1 == byteNum2);
	}

	// Uppgift 9
	@Test
	public void testObjectsAreSame() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1 != obj2);
	}

	// Uppgift 10
	@Test
	public void testObjectsAreNotSame() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}

}
