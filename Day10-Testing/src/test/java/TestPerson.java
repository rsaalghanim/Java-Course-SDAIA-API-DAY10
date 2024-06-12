import HW3.Person;
import org.junit.jupiter.api.*;

public class TestPerson {

    private Person person;
    @BeforeAll
    public static void init() {

        System.out.println("init before all");
    }

    @AfterAll
    public static void clean() {

        System.out.println("cleaning after all");
    }

    @BeforeEach
    public void setup() {
        person = new Person("Ragad Alghanim", 30, "123 Main St");
    }

    @Test
    public void testGetName() {
        String name = person.getName();
        Assertions.assertEquals("Ragad Alghanim", name);
    }

    @Test
    public void testSetName() {
        person.setName("Jane Smith");
        String name = person.getName();
        Assertions.assertEquals("Jane Smith", name);
    }

    @Test
    public void testGetAge() {
        int age = person.getAge();
        Assertions.assertEquals(30, age);
    }

    @Test
    public void testSetAgeWithValidAge() {
        person.setAge(35);
        int age = person.getAge();
        Assertions.assertEquals(35, age);
    }

    @Test
    public void testSetAgeWithInvalidAge() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.setAge(200);
        });
        int age = person.getAge();
        Assertions.assertEquals(30, age);
    }

    @Test
    public void testGetAddress() {
        String address = person.getAddress();
        Assertions.assertEquals("123 Main St", address);
    }

    @Test
    public void testSetAddress() {
        person.setAddress("456 Elm St");
        String address = person.getAddress();
        Assertions.assertEquals("456 Elm St", address);
    }

    @Test
    public void testGetDetail() {
        String detail = person.getDetail();
        Assertions.assertEquals("Person{name= Ragad Alghanim, age= 30, address= 123 Main St'}", detail);
    }
}
