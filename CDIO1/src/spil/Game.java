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

public class Game {

    int Die1value, Die2value;   // Number showing on the first die.

    public Game() {
        roll();
    }

    //method roll to roll the dice
    public void roll() {
        Die1value = (int)(Math.random()*6) + 1;
        Die2value = (int)(Math.random()*6) + 1;
    }
}