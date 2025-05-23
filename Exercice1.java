import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Claculatrice.java;

public class CalculatriceTest {



    @Test
    public void testAdd() {
        Calculatrice c = new Calculatrice
        assertEquals(8.0f, c.add(5.0f, 3.0f));
    }

    @Test
    public void testDiv(){
        Calculatrice c = new Calculatrice
        assertEquals(2.0f, c.div(4.0f, 2.0f));
    }

    @Test

    public void testMult(){
            Calculatrice c = new Calculatrice
            assertEquals(10.0f, c.mult(5.0f, 2.0f))
    }

     @Test
    public void testDivByZero() {
        Calculatrice c = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> c.div(4.0f, 0.0f));
    }

    
}
