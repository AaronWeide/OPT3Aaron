import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewUserTest {

    @org.junit.jupiter.api.Test
    @Test
    void Randvoorwaarden1en2() {

            User testA = new User(15, true);
            User testB = new User(16, true);
            User testC = new User(17, true);

            assertEquals(testA.getUserRank(), 0);
            assertEquals(testB.getUserRank(), 1);
            assertEquals(testC.getUserRank(), 1);

    }
    @Test
    void Randvoorwaarden2() {

        User testA = new User(18, true);
        User testB = new User(19, true);

        assertEquals(testA.getUserRank(), 2);
        assertEquals(testB.getUserRank(), 2);

    }
    @Test
    void Randvoorwaarden3() {

        User testA = new User(27, true);
        User testB = new User(28, true);
        User testC = new User(29, true);

        assertEquals(testA.getUserRank(), 2);
        assertEquals(testB.getUserRank(), 3);
        assertEquals(testC.getUserRank(), 3);

    }
}