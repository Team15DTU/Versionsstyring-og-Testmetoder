package automat;

import static org.junit.Assert.*;

public class BilletautomatTest {
    Billetautomat billettest = new Billetautomat();

    @org.junit.Test
    public void getBilletpris() {
        assertEquals(10,  billettest.getBilletpris());
    }

    @org.junit.Test
    public void indsætPenge() {
        billettest.indsætPenge(100);
        assertEquals(100, billettest.getBalance());
    }

    @org.junit.Test
    public void getBalance() {

        assertEquals(0 ,billettest.getBalance());
   }

    @org.junit.Test
    public void returpenge() {
    }

    @org.junit.Test
    public void montørLogin() {
    }

    @org.junit.Test
    public void getTotal() {
    }

    @org.junit.Test
    public void getAntalBilletterSolgt() {
    }

    @org.junit.Test
    public void setBilletpris() {
    }

    @org.junit.Test
    public void nulstil() {
    }

    @org.junit.Test
    public void setAntalBilletterSolgt() {
    }

    @org.junit.Test
    public void erMontør() {
    }
}