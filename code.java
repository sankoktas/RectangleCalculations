/**This program prompts the user for width and height of a rectangle and calculates the perimeter and area of it.
 * @author (Fikri San Koktas)
 * @version (12 October 2020)
 */
import java.util.Scanner;
public class KFS_RectangleCalculations_Main
{  
     public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the width of the rectangle: ");
        double width = in.nextDouble();
        
        System.out.print("Please enter the height of the rectangle: ");
        double height = in.nextDouble();
        
        double sum = width + height;
        System.out.println("Perimeter: " + 2*sum);

        double area = width * height;
        System.out.println("Area: " + area);
    }
}
