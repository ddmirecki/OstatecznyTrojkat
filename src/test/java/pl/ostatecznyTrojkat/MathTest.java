package pl.ostatecznyTrojkat;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2017-01-05.
 */
public class MathTest {
    @Test
    public void getFactors_simple() {

        // nowy komentarz
        List<Factors> factors = Math.getFactors(10);

        assertTrue(factors.contains(new Factors(10, 1)));

        assertEquals(factors.size(), 4);
        assertEquals(factors.get(0).getX(), 1);
        assertEquals(factors.get(0).getY(), 10);

        assertEquals(factors.get(3).getX(), 10);
        assertEquals(factors.get(3).getY(), 1);

    }
}
