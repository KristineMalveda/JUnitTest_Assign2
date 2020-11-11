package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Bonus_Test {

	
	private final Person person = new Person();
	
	@BeforeEach
	public void setUp() {
		person.setFirstName("Kristine");
		person.setLastName("Malveda");
		person.setAge(36);
	}
	
	@Test
	@DisplayName("Test First Name")
	public void checkFirstName() {
		String firstName = person.getFirstName();
		assertEquals("Kristine", firstName);
		
	}

	@Test
	@DisplayName("Test Last Name")
	public void checkLastName() {
		String lastName = person.getLastName();
		assertEquals("Malveda", lastName);
		
	}

	@Test
	@DisplayName("Test Age")
	public void checkAge() {
		int age = person.getAge();
		assertEquals(36, age);
		
	}

}
