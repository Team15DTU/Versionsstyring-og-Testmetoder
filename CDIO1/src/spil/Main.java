package spil;

import spil.Die;
import java.util.Scanner;

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

public class Main {

    public static void main (String args[]) {

        Scanner scanner = new Scanner();

        Die die1 = new Die(); //initialiserer instance af terningen.
        Die die2 = new Die();
        Player player1 = new Player();
        System.out.println("Set player name: ");
        Player player2 = new Player();
        System.out.println("Set player name: ");


        if (die1.DieCheck(10000)) { //test af en terning genne Chi2 test.
            System.out.println("The tested dice is true.");
        } else {
            System.out.println("The tested dice is false.");
        }




        while (player1.score < 40 && player2.score < 40) {

            System.out.println("Press r to roll");


        }
        die1.roll();
        die2.roll();
        System.out.println("You rolled "+die1.FaceValue+" and "+die2.FaceValue);
 }

    /*
    private int getSum(Die one, Die two) {
        sum = roll.one+roll.two;
        return sum;
    } //returnerer summen af øjnene

    private boolean getEns(Die one, Die two) {
        if (roll.one == roll.two) {
            equal = true;
        }
        return equal;
    } //returnerer on øjnene er ens

    //setDice(int, int) //placerer terninger med angivet værdi
    */
}