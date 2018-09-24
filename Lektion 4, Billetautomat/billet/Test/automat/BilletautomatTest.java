package automat;

import org.junit.Test;

import static org.junit.Assert.*;

public class BilletautomatTest {

    Billetautomat billetautomatTest = new Billetautomat();

    @Test
    public void getBalance() {

        assertEquals(0, billetautomatTest.getBalance());

    }

    @Test
    public void returPenge() {

        assertEquals(0, billetautomatTest.returpenge());
    }

    @Test
    public void indsætPenge() {

        billetautomatTest.indsætPenge(100);
        assertEquals(100, billetautomatTest.getBalance());

    }
}