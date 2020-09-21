import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FpbTest {
    private final static int MAX_INT = Integer.MAX_VALUE;
    private final static int MIN_INT = -MAX_INT;

    @Test
    void FpbBoundaryTest() {
        Assertions.assertEquals(MAX_INT, Fpb.fpb(MAX_INT, MAX_INT));
        Assertions.assertEquals(1, Fpb.fpb(MAX_INT, MAX_INT - 1));
        Assertions.assertEquals(1, Fpb.fpb(MAX_INT - 1, MAX_INT ));
        Assertions.assertEquals(MAX_INT - 1, Fpb.fpb(MAX_INT - 1, MAX_INT - 1 ));

        Assertions.assertEquals(MAX_INT, Fpb.fpb(MIN_INT, MAX_INT ));
        Assertions.assertEquals(1, Fpb.fpb(MIN_INT , MAX_INT - 1 ));
        Assertions.assertEquals(1, Fpb.fpb(MIN_INT + 1 , MAX_INT ));
        Assertions.assertEquals(MAX_INT - 1, Fpb.fpb(MIN_INT + 1 , MAX_INT -1 ));

        Assertions.assertEquals(-MIN_INT, Fpb.fpb(MIN_INT, MIN_INT ));
        Assertions.assertEquals(1, Fpb.fpb(MIN_INT , MIN_INT + 1 ));
        Assertions.assertEquals(1, Fpb.fpb(MIN_INT + 1 , MIN_INT ));
        Assertions.assertEquals(-(MIN_INT + 1), Fpb.fpb(MIN_INT + 1 , MIN_INT + 1 ));

        Assertions.assertEquals(MAX_INT, Fpb.fpb(MAX_INT, MIN_INT ));
        Assertions.assertEquals(1, Fpb.fpb(MAX_INT , MIN_INT + 1 ));
        Assertions.assertEquals(1, Fpb.fpb(MAX_INT - 1 , MIN_INT ));
        Assertions.assertEquals(MAX_INT - 1, Fpb.fpb(MAX_INT - 1 , MIN_INT + 1 ));

        Assertions.assertEquals(MAX_INT - 1, Fpb.fpb(0, MAX_INT - 1 ));

        Assertions.assertEquals(MIN_INT + 1, Fpb.fpb(0, MIN_INT + 1 ));
    }
    @Test
    void FpbNormalTest() {
        Assertions.assertEquals(2, Fpb.fpb(10, 12));
        Assertions.assertEquals(0, Fpb.fpb(0, 0));
        Assertions.assertEquals(1, Fpb.fpb(10, 11));
        Assertions.assertEquals(5, Fpb.fpb(100, 15));
        Assertions.assertEquals(2, Fpb.fpb(-10, 2));
        Assertions.assertEquals(2, Fpb.fpb(10, -2));
        Assertions.assertEquals(2, Fpb.fpb(-10, -2));
    }
}