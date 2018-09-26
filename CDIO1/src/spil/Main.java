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

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die(); //initialiserer instance af terningen.
        Die die2 = new Die();

        if (die1.DieCheck(10000)) { //test af en terning genne Chi2 test.
            System.out.println("The tested dice is true.");
        } else {
            System.out.println("The tested dice is false.");
        }

        Player player1 = new Player();
        System.out.println("Type player name:");
        player1.name = scanner.next();

        Player player2 = new Player();
        System.out.println("Type player name:");
        player1.name = scanner.next();

        while (player1.score < 40 || player2.score < 40) {
            System.out.println("Press 'r' to roll dice for player one");
            player1.name = scanner.next();
            die1.roll();
            die2.roll();
            System.out.println("You rolled " + die1.FaceValue + " and " + die2.FaceValue);
            player1.score = player1.score + die1.FaceValue + die2.FaceValue;
            System.out.println("Your score is " + player1.score+"\n");
            System.out.println("Press 'r' to roll dice for player two");
            player1.name = scanner.next();
            die1.roll();
            die2.roll();
            player1.score = player1.score + die1.FaceValue + die2.FaceValue;
            System.out.println("You rolled " + die1.FaceValue + " and " + die2.FaceValue);
            System.out.println("Your score is " + player1.score+"\n");
        }

        if (player1.score > player2.score) {
            System.out.printf("Player "+ player1.name+" won!");
        } else {
            System.out.printf("Player "+ player2.name+" won!");
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