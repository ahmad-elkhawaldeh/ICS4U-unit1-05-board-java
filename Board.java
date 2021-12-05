/*
* The "BoardFoot" program 
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-11-23
*/

import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class Board {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Board() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting boardCalculator() function.
    *
    * @param width is width
    * @param height is height
    *
    * @return length
    */
    static double boardCalculator(final double width, final double height) {
        final double boardFoot = 144.0;

        final double length = boardFoot / (width * height);

        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            final Scanner input = new Scanner(System.in);
            System.out.println( "input the width");

            final double width = Double.parseDouble(input.nextLine());
            System.out.println("input the hight");

            final double height = Double.parseDouble(input.nextLine());
            final double length = boardCalculator(width, height);
            System.out.println("\nThe wood should be:" + length + " inches.");
        } catch (java.lang.NumberFormatException error) {
            System.out.println("\n Error not an integer: ");
        }
        System.out.println("\nDone.");
    }
}
