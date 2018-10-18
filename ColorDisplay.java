package compsci;
import compsci.DrawingPanel;
import java.awt.*;
import java.util.*;

public class ColorDisplay {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    System.out.println("This project written by YOURNAME\n");
    Color c1 = readColor();
    String s1 = colorToString(c1);
    System.out.println("The first color is " + s1 + "\n");
    Color c2 = readColor();
    String s2 = colorToString(c2);
    System.out.println("The second color is " + s2 + "\n");
    Color c3 = readColor();
    String s3 = colorToString(c3);
    System.out.println("The third color is " + s3 + "\n");
    Color c4 = readColor();
    String s4 = colorToString(c4);
    System.out.println("The fourth color is " + s4 + "\n");
    DrawingPanel panel = new DrawingPanel(550,550);
    Graphics g = panel.getGraphics();
    displayColors(g, c1, c2, c3, c4);
  }
  
    public static Color readColor() {
        //TODO: Write readColor
        
        Color out = new Color();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a color (three values between 0 and 255): ");
        String RGB = sc.nextLine();
        int[] rgbArray = lineToArrray(RGB);
        // Move this string to colorToString
        System.out.println("The first color is: [r=" + rgbArray[0] + ",g=" + rgbArray[1] + ",b=" + rgbArray[2] + "]");
        
        out.red = rgbArray[0];
        out.green = rgbArray[1];
        out.blue = rgbArray[2];
    
        return out;
    }

    private static String colorToString(Color input) {
        //TODO: Write colorToString
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void displayColors(Graphics g, Color c1, Color c2, Color c3, Color c4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static int[] lineToArrray(String RGB) {
        String[] stringArray = RGB.split(" ");
        int[] rgbArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
           rgbArray[i] = Integer.parseInt(stringArray[i]);
        }
        return rgbArray;
    }
    
}