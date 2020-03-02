/*
    StudentTests class
    Padraig Ó Cosgora
    G00311302
    21/02/2020
 */
import gmit.groupC.g00311302.Passenger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class PassengerTest {

    private Passenger myPassenger;

    @BeforeAll
    @DisplayName("Starting tests")
    public static void print(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New instance of Passenger")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myPassenger = new Passenger();
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Testing Name Getter and Setter of Passenger")
    void testGettersAndSetters(TestInfo testInfo)
    {
        //myPassenger.setName("John Doe");
        //assertEquals(myPassenger.getName(),"John Doe");
        myPassenger.setName("John");
        assertEquals(myPassenger.getName(),"John");
    }

    @Test
    @DisplayName("Invalid Title setter test")
    void testTitleInvalid(TestInfo testInfo)
    {
        myPassenger.setTitle("Mr");
        assertEquals(myPassenger.getTitle(),"Mr");
        myPassenger.setTitle("Ms");
        assertEquals(myPassenger.getTitle(),"Ms");
        myPassenger.setTitle("Mrs");
        assertEquals(myPassenger.getTitle(),"Mrs");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setTitle("Miss");
        });
    }

    @Test
    @DisplayName("Invalid Name setter Test")
    void testNameInvalid(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setName("ze");
        });
    }

    @Test
    @DisplayName("Invalid Name setter Test")
    void testNameSetID(TestInfo testInfo)
    {
        myPassenger.setID(1000000000);
        assertEquals(myPassenger.getID(),1000000000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setID(1);
        });
    }

    @Test
    @DisplayName("Invalid Name setter Test")
    void testNameSetAge(TestInfo testInfo)
    {
        myPassenger.setAge(17);
        assertEquals(myPassenger.getAge(),17);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setAge(1);
        });
    }

    @Test
    @DisplayName("Invalid Name setter Test")
    void testNameSetPhoneNumber(TestInfo testInfo)
    {
        myPassenger.setPhoneNumber("0123456789");
        assertEquals(myPassenger.getPhoneNumber(),"0123456789");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setPhoneNumber("123123");
        });
    }

    @Test
    @DisplayName("Invalid Constructor Test (invalid name)")
    void testConstructorPassengerName(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", "Ze", 1000000000, "0123456789", 16);
        });
    }

    @Test
    @DisplayName("Invalid Constructor Test (invalid title)")
    void testConstructorPassengerTitle(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Miss", "John", 1000000000, "0123456789", 16);
        });
    }

    @Test
    @DisplayName("Invalid Constructor Test (invalid ID)")
    void testConstructorPassengerID(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", "John", 4000, "0123456789", 16);
        });
    }

    @Test
    @DisplayName("Invalid Constructor Test (invalid phone)")
    void testConstructorPassengerPhone(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", "John", 1000000000, "12345", 16);
        });
    }

    @Test
    @DisplayName("Invalid Constructor Test (invalid age)")
    void testConstructorPassengerAge(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Ms", "John", 1000000000, "0123456789", 14);
        });
    }

    @Test
    @DisplayName("Valid Constructor test")
    void testConstructorValid(TestInfo testInfo)
    {
        Passenger passenger1 = new Passenger("Mr", "John Doe", 1000000000, "0123456789",
                17);
        assertEquals("John Doe", passenger1.getName());
        assertEquals("Mr", passenger1.getTitle());
        assertEquals(1000000000, passenger1.getID());
        assertEquals("0123456789", passenger1.getPhoneNumber());
        assertEquals(17, passenger1.getAge());
    }

    @AfterAll
    @DisplayName("Testing complete")
    public static void done(){
        System.out.println("Testing Complete");
    }
}
