package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public class PersonTest {

	private final Person person = new Person();
	
	@BeforeAll
	public void setUp() {
		person.setFirstName("Kristine");
		person.setLastName("Malveda");
		person.setAge(35);
	}

	@Test
	@DisplayName("Test First Name")
	public void checkFirstName() {
		String firstName = person.getFirstName();
		assertEquals("Kristine", firstName, "\n The values in checkFirstName Test are not the same");
	}

	@Test
	@DisplayName("Test Last Name")
	public void checkLastName() {
		String lastName = person.getLastName();
		assertEquals("Malveda", lastName, "\n The values in checkLastName Test are not the same");

	}

	@Test
	@DisplayName("Test Age")
	public void checkAge() {
		int age = person.getAge();
		assertEquals(35, age, "\n The values in checkAge Test are not the same");

	}

}
