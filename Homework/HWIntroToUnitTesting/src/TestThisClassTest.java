import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestThisClassTest {

    @Test
    public void testNumberOfXs() {
        // Lowercase x only
        assertEquals(1, TestThisClass.numberOfXs("x"));

        // Uppercase X only
        assertEquals(1, TestThisClass.numberOfXs("X"));

        // Multiple uppercase and lowercase Xs mixed with other letters
        assertEquals(4, TestThisClass.numberOfXs("xXabcXx"));

        // No Xs, return 0
        // Fails because original method incorrectly counts some non-X characters
        assertEquals(0, TestThisClass.numberOfXs("y"));
    }

    @Test
    public void testCountChocula() {
        // No occurrences of Chocula
        assertEquals(0, TestThisClass.countChocula("hello"));

        // One occurrence with characters after
        assertEquals(1, TestThisClass.countChocula("Chocula!"));

        // Case-sensitive, lowercase should not count
        assertEquals(0, TestThisClass.countChocula("chocula!"));

        // Chocula occurs exactly at end of the string
        // Fails because original loop stops one place too early
        assertEquals(1, TestThisClass.countChocula("Chocula"));
    }

    @Test
    public void testCountAlternations() {
        // All positive numbers means no alternations
        assertEquals(0,
                TestThisClass.countAlternations(new int[] {1, 2, 3, 4}));

        // One change from positive to negative
        assertEquals(1,
                TestThisClass.countAlternations(new int[] {1, -2, -3}));

        // Alternates every position
        assertEquals(3,
                TestThisClass.countAlternations(new int[] {1, -2, 3, -4}));

        // Example from specification has three alternations
        assertEquals(3,
                TestThisClass.countAlternations(new int[] {1, -3, 74, 35, -64}));
    }
}