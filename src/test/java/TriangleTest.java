import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class TriangleTest {
    private static Triangle t1;


    @BeforeAll
//    // подготовка к проведению тестов
    public static void createNewTriangle() {
        t1 = new Triangle();
    }

    @Test
    public void allPositiveSidesShouldGiveExpectedResult() {
        t1.setA(4);
        t1.setB(5);
        t1.setC(5);
        Assertions.assertEquals(9.16515138991168, t1.ploschadTreugolnika(), 0);
    }


    @Test
    public void oneZeroSideShouldThrowException() {
        t1.setA(0);
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> t1.ploschadTreugolnika());
        Assertions.assertEquals("At least one side of given triangle is zero! Check your parameters.", exception.getMessage());
    }

    @Test
    public void negativeSideShouldThrowException() {
        t1.setA(-8);
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> t1.ploschadTreugolnika());
        Assertions.assertEquals("One or more sides of given triangle are negative! Check your parameters.", exception.getMessage());
    }

}

