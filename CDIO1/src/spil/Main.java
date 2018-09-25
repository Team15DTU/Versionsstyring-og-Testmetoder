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

        int i = 0;
        int totRolls = 10000;

        Die die1 = new Die();
        Die die2 = new Die();

        while (i < totRolls) {
            die1.roll();
            die2.roll();
            i++;
        }

        die1.DieCheck(10000);

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