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

        assertEquals(0, billettest.returpenge());
    }

    @org.junit.Test
    public void montørLogin() {

        billettest.udskrivBillet();
        billettest.montørLogin("1234");
        assertEquals(1,billettest.getAntalBilletterSolgt());

    }

    @org.junit.Test
    public void getTotal() {

        billettest.montørLogin("1234");
        billettest.setBilletpris(99);
        assertEquals(99,billettest.getBilletpris());

    }

    @org.junit.Test
    public void getAntalBilletterSolgt() {

        billettest.montørLogin("1234");
        billettest.udskrivBillet();
        assertEquals(1, billettest.getAntalBilletterSolgt());

    }

    @org.junit.Test
    public void setBilletpris() {

        billettest.montørLogin("1234");
        billettest.setBilletpris(49);
        assertEquals(49,billettest.getBilletpris());
    }

    @org.junit.Test
    public void nulstil() {

        billettest.udskrivBillet();
        billettest.montørLogin("1234");
        assertEquals(1,billettest.getAntalBilletterSolgt());
        billettest.nulstil();
        assertEquals(0, billettest.getAntalBilletterSolgt());
    }

    @org.junit.Test
    public void setAntalBilletterSolgt() {

        billettest.udskrivBillet();
        billettest.udskrivBillet();
        billettest.montørLogin("1234");
        assertEquals(2,billettest.getAntalBilletterSolgt());

    }

    @org.junit.Test
    public void erMontør() {

        billettest.montørLogin("1234");
        assertEquals(true, billettest.erMontør());


    }
}