/**
 * @author Gruppe 15
 * Navn og studienummer:
 * Karl Emil Jeppesen       s180557
 * Alfred Röttger Rydahl    s160107
 * Said Abdullahi           s185013
 * Søren Poulsen            s180905
 * Rasmus Sander Larsen     s185097
 * Noah F. M. Hamza         s185084
 * Dato: 11-09-2018
 * SWT/ITØ Danmarks Tekniske Universitet
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        /*
        Ask the user for the height and radius of the cylinder, and then call the
        calcCylVol() method with the given inputs.
        The while loop will go for max. "maxLoopCount" to avoid an infinite loop.
         */
        byte maxLoopCount = 6;
        byte count = 0;
        while (count < maxLoopCount) {
            try {
                /*
                Start by getting the height of the cylinder, and check if input is positive
                ------------------------------------------------------------------------------------
                 */
                System.out.print("Indtast højden(i meter) på cylinderen: ");
                String userInput0 = scan.next();    // Getting the height of the cylinder
                double height = Double.parseDouble(userInput0); // Parsing the String to a useful double

                // Checking if the height isn't positive
                if (height < 0)
                {
                    throw new NumberFormatException();
                }

                /*
                ------------------------------------------------------------------------------------
                Then get the radius of the cylinder and check if input is positive
                ------------------------------------------------------------------------------------
                 */
                System.out.print("Indtast radius (i meter) på cylinderen: ");
                String userInput1 = scan.next();    // Getting the radius of the cylinder
                double radius = Double.parseDouble(userInput1); // Parsing the String to a useful double

                // Checking if radius isn't positive
                if (radius < 0)
                {
                    throw new NumberFormatException();
                }

                /*
                ------------------------------------------------------------------------------------
                Now call the calcCylVol, and print out the calculated result.
                ------------------------------------------------------------------------------------
                 */
                System.out.println("Rumfanget af din cylinder er: " + calcCylVol(height, radius) + " m^3");

                // STOP LOOP
                break;
            }

            catch (NumberFormatException e)
            {
                // Increment the loop counter
                ++count;

                /*
                 Check if there's more attempts left
                 */
                if (count >= maxLoopCount)  // If not
                {
                    // Print closing error message
                    System.out.println("Ukorrekt input igen ... skovl! \nProgrammet lukkes ...");
                }
                else {  // If yes
                    // Print error message
                    System.out.println("Ukorrekt input, prøv igen");
                    System.out.println();   // Some spacing for readability
                }
            }
        }

        // Close Scanner
        scan.close();
    }

    /**
     * This method is calculating the radius of a given cylinder.
     *
     * @param height Takes the height of the cylinder as a "double"
     * @param radius Takes the radius of the cylinder as a "double"
     * @return The method returns the volume of the cylinder as a "double"
     */
    public static double calcCylVol(double height, double radius)
    {
        // Calculate the result
        double result = height*radius*radius*Math.PI;
        
        // Round the result
        result = Math.round(result*100.0) / 100.0;

        // Return the calculated result
        return result;
    }
   }
