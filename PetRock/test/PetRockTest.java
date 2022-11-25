import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testHappy() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testUnHappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
    rocky.playWithRocky();
        assertTrue(rocky.isHappy());

    }
}