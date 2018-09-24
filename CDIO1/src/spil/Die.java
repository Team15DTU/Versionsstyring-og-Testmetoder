package spil;

import sun.applet.Main;

import java.util.Random;
import java.lang.Math;

/**
 * @author Gruppe 15
 * Navn og studienummer:
 * Karl Emil Jeppesen       s180557
 * Alfred Röttger Rydahl    s160107
 * Said Abdullahi           s185013
 * Søren Poulsen            s180905
 * Rasmus Sander Larsen     s185097
 * Noah F. M. Hamza         s185084
 * Dato: 24-09-2018
 * SWT/ITØ Danmarks Tekniske Universitet
 */

public class Die extends Main {

    //create structure Die

    int dots;
    int roll;
    int sum;
    boolean equal = false;
    Random number = new Random(); //initializes random number

    private Die(){
        int dots = number.nextInt(6)+1 ; //6 is maximum and minimum is one
    }

    public void roll(){
        roll = number.nextInt(dots)+1;
    }

    public int getDots(){
        return roll;
    }

}
