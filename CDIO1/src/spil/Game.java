package spil;

import java.util.Scanner;
//import sun.applet.Main;

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

    Scanner scanner = new Scanner(System.in);
    String input;

    public void theGame (Player player1, Player player2, Die die1, Die die2){

        System.out.println("Type first player name:");
        player1.name = scanner.next();
        System.out.println("Type second player name:");
        player2.name = scanner.next();

        while (player1.score < 40 && player2.score < 40) {

            System.out.println("Press 'r' to roll dice for "+player1.name);
            input = scanner.next();
            die1.roll();
            die2.roll();
            System.out.println("You rolled "+die1.FaceValue+" and "+die2.FaceValue);
            player1.score=player1.score+die1.FaceValue+die2.FaceValue;
            System.out.println("Your score is "+player1.score+"\n");
            System.out.println("Press 'r' to roll dice for "+player2.name);
            input=scanner.next();
            die1.roll();
            die2.roll();
            player2.score=player2.score+die1.FaceValue+die2.FaceValue;
            System.out.println("You rolled "+die1.FaceValue+" and "+die2.FaceValue);
            System.out.println("Your score is "+player2.score+"\n");
        }

        if(player1.score>player2.score){
        System.out.printf(player1.name+" won!");
        }else{
        System.out.printf(player2.name+" won!");
        }

    }

}