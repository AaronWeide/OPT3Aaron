import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    @Test
    void userIn() {
                oldUser testA = new oldUser(18, "Student", true );
                oldUser testB = new oldUser(17, "Docent", true);
                oldUser testC = new oldUser(17, "student", false);
                oldUser testD = new oldUser(17, "student", true);

                assertNotEquals(testA.getAge(), 17);
                assertEquals(testA.getUserStatus(), "Student");
                assertTrue(testA.getLoggedInStatus());

                assertEquals(testB.getAge(), 17);
                assertEquals(testB.getUserStatus(), "Docent");
                assertTrue(testB.getLoggedInStatus());

                assertEquals(testC.getAge(), 17);
                assertEquals(testC.getUserStatus(), "student");
                assertFalse(testC.getLoggedInStatus());

                assertEquals(testD.getAge(), 17);
                assertEquals(testD.getUserStatus(), "student");
                assertTrue(testD.getLoggedInStatus());


    }
}