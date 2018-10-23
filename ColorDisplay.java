package compsci;
import compsci.DrawingPanel;
import java.awt.*;
import java.util.*;

public class ColorDisplay {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    System.out.println("This project written by Austin Abel\n");
    Color c1 = readColor();
    System.out.println("The first color is: [r=" + c1.red + ",g=" + c1.green + ",b=" + c1.blue + "]");
    Color c2 = readColor();
    System.out.println("The second color is: [r=" + c2.red + ",g=" + c2.green + ",b=" + c2.blue + "]");
    Color c3 = readColor();
    System.out.println("The third color is: [r=" + c3.red + ",g=" + c3.green + ",b=" + c3.blue + "]");
    Color c4 = readColor();
    System.out.println("The fourth color is: [r=" + c4.red + ",g=" + c4.green + ",b=" + c4.blue + "]");
    DrawingPanel panel = new DrawingPanel(550,550);
    Graphics g = panel.getGraphics();
    displayColors(g, c1, c2, c3, c4);
  }
  
    public static Color readColor() {
        //TODO: Write readColor
        
        Color out = new Color();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int[] rgbArray = {0, 0, 0};
        
        while(!exit) { 
            
            exit = true;
            
            System.out.println("Enter a color (three values between 0 and 255): ");
            String RGB = sc.nextLine();
            rgbArray = lineToArrray(RGB);

            out.red = rgbArray[0];
            out.green = rgbArray[1];
            out.blue = rgbArray[2];

            if (out.red < 0 || out.red > 255) {
                System.out.println("The red value " + out.red + " is out of range");
                exit = false;
            }
            if (out.green < 0 || out.green > 255) {
                System.out.println("The greed value " + out.green + " is out of range");
                exit = false;
            }
            if (out.blue < 0 || out.blue > 255) {
                System.out.println("The blue value " + out.blue + " is out of range");
                exit = false;
            }
        
        }
        return out;
    }
    
    /*
    private static String colorToString(Color input) {
        //TODO: Write colorToString
        throw new UnsupportedOperationException("Not supported yet.");
    }
    */

    private static void displayColors(Graphics g, Color c1, Color c2, Color c3, Color c4) {
        // Look at Simple Display. Think about division ratios.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static int[] lineToArrray(String RGB) {
        String[] stringArray = RGB.split(" ");
        int[] rgbArray = new int[stringArray.length];
        
        // Error handling for not 3 numbers finish it.
        if (stringArray.length < 3) {
            System.out.println("Please enter exactly 3 numbers.");
            return {-123, 0, 0};
        }

        for (int i = 0; i < stringArray.length; i++) {
           rgbArray[i] = Integer.parseInt(stringArray[i]);
        }
        return rgbArray;
    }
    
}
