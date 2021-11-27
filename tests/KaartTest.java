import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KaartTest {
    Kaart kaart;
    @Before
    public void setUp() throws Exception {
        kaart = new Kaart();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBovengrensType()
    {kaart = new Kaart(100, "schoppen");

    }
    @Test(expected = IllegalArgumentException.class)
    public void testOndergrensType() {
        kaart = new Kaart(-1,"schoppen");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testnaam() {
        kaart = new Kaart(1,"spel");
    }
    @Test
            public void testRandomNummer()
    {
        kaart = new Kaart();
        for(int i = 0; i <10;i ++ )
        {
            if (kaart.getNummer() > 13 || kaart.getNummer() < 0) {
                throw new IllegalStateException();
            }
        }
    }
    @Test(expected = IllegalArgumentException)
    @Test
    public void testEquals() {

    }
}