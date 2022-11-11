//Name: Alexander
//Period: 2
//Due Date: 11/18/2022

import java.util.Scanner;


public class PaintGallons
{
    public static void main(String[] args) 
    {
        //******************************************************************************
        /*
            Square feet per gallon. 
            Leave as is.  
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Gallon Coverage:   ");
        int sq_ftGallon = input.nextInt();
        System.out.println();

        System.out.println("*************************************************************");
        //******************************************************************************

        // *******  ENTER ALL OF YOUR CODE BELOW THIS LINE.  DO NOT TOUCH THE CODE ABOVE! *******

        // Variable for Random Assignment
        int height;
        int width;
        int length;

        // Variable for Calculations
        int areaWall1;
        int areaWall2;
        int areaCeiling;
        double totalArea;
        double gallonsNeeded;

        // Generate Numbers
        height = (int)(Math.random()*7)+10;
        width = (int)(Math.random()*7)+12;
        length = (int)(Math.random()*9)+14;
        
        // Output Random Values
        System.out.println("Height:  " + height);
        System.out.println("Width:   " + width);
        System.out.println("Length:  " + length);
        System.out.println();

        // Area Calculation
        areaWall1 = (height*length)*2;
        areaWall2 = (height*width)*2;
        areaCeiling = length*width;
        totalArea = areaWall1+areaWall2+areaCeiling;

        // Output Area Total
        System.out.println("Total Area:  " + (int)totalArea);
        System.out.println();

        // Gallon Calculation
        gallonsNeeded = Math.ceil(totalArea/sq_ftGallon);

        // Output Gallons Needed
        System.out.println("Gallons Needed:  " + (int)gallonsNeeded);
    } //end main
}//end class

