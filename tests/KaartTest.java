import org.junit.Before;
import org.junit.Test;

import java.nio.channels.FileLockInterruptionException;

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
        for(int i = 0; i <100;i ++ )
        {
            if (kaart.getNummer() > 15 || kaart.getNummer() < 0) {
                throw new IllegalStateException();
            }
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testEqualsmetNull()
    {
        Kaart x = null;
        kaart.equals(x);
    }
    @Test
    public void testEquals() {
        kaart = new Kaart(2, "schoppen");
        Kaart x = new Kaart(2, "schoppen");
       assertTrue(kaart.equals(x));
       x = new Kaart(2, "harten");
       assertFalse(x.equals(kaart));
    }
    @Test
    public void testLegeConstructoOpNummer()
    {
        for(int i = 0; i < 100; i ++ )
        {
            kaart = new Kaart();
            if(kaart.getNummer()>15 || kaart.getNummer()<0)
                throw new IllegalStateException();
        }
    }
    @Test
    public void testLegeConstructorOpType()
    {
        for (int i = 0; i < 100; i++) {
            kaart = new Kaart();
            if(kaart.getType()!= "schoppen" && kaart.getType() != "harten" && kaart.getType() != "ruiten" && kaart.getType()!="klaveren")
                throw new IllegalStateException();
        }
    }
}