import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatriceTest {


    @Test
    public void testAdd() {
        Calculatrice clc = new Calculatrice() ;
        assertEquals(8.0f, clc.add(5.0f, 3.0f));
    }

    @Test
    public void testDiv(){
        Calculatrice clc = new Calculatrice();
        assertEquals(2.0f, clc.div(4.0f, 2.0f));
    }

    @Test

    public void testMult(){
            Calculatrice clc = new Calculatrice();
            assertEquals(10.0f, clc.mult(5.0f, 2.0f));
    }

    @Test
    public void testDivpParZero() {
        Calculatrice clc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> clc.div(4.0f, 0.0f));
    }

    @Test
    void testMinus() {
        Calculatrice clc = new Calculatrice();
        assertEquals(4.0f, clc.minus(7.0f, 3.0f));
    }

    @Test
    void testMinusNegatif() {
        Calculatrice clc = new Calculatrice();
        assertEquals(-2.0f, clc.minus(3.0f, 5.0f));

    }

}
