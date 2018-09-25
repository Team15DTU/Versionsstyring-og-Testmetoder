package spil;

import spil.Die;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 24-09-2018
 * University: DTU
 */
public class Main {

    public static void main (String args[]) {

        Die die1 = new Die(); //initialiserer instance af terningen.
        Die die2 = new Die();

        if (die1.DieCheck(10000) == true) { //test af en terning genne Chi2 test.
            System.out.println("The tested dice is true.");
        } else {
            System.out.println("The tested dice is false.");
        }
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