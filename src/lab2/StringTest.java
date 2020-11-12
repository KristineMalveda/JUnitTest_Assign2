package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringTest {

	// Uppgift 1
	@Test
	public void writingSometextBackwards() {
		StringBuilder stringbuilder = new StringBuilder("Jag");
		String reversedWord = stringbuilder.reverse().toString();
		assertEquals("gaJ", reversedWord);
	}

	// Uppgift 2 
	@Test
	public void justASimpleAssert() {
		String name = "My name";
		assertEquals("My name", name);
		//return "String";
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
	public void testingAsSimpleAsPossible() {
		String jUnit = "Junit 5";
		int jUnitLength = jUnit.length();
		assertEquals(7, jUnitLength);
	}

	// Uppgift 5 - man måste lägga till @Test -annotation för att testa metoden
	@Test
	public void giveMeASimpleVerification() {
		assertEquals(100, 100);
	}

	// Uppgift 6
	@Test
	public void checkingSame() {
		String s1 = new String("S1");
		String s2 = new String("S1");
		s1 = s2;
		assertSame(s1, s2);
	}

	// Uppgift 7
	@Test
	public void checkingBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertTrue(smallByte1 == smallByte2);
	}

	// Uppgift 9
	@Test
	public void checkingTrue() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}

	// Uppgift 10
	@Test
	public void checkingFalse() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1 != obj2);
	}

}
