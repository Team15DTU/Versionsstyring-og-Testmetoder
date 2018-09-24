import spil.Die;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 24-09-2018
 * University: DTU
 */
public class Main {

    public static void main (String args[]) {

        Die die = new Die();
        die.roll();
        System.out.println("You rolled "+die.getDots()" in this round");

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