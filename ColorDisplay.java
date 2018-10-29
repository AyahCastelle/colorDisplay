package colordisplay;
import java.awt.*;
import java.util.*;

public class ColorDisplay {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Project 2 written by Austin Abel\n");
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

    private static String colorToString(Color c) {
        String color = "" + c;
        color = color.replaceAll("java.awt.Color", "");
        
        return color;
    }

    private static Color readColor() {
        boolean cond = false;
        int exitCount = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        
        while(!cond) {
            if (exitCount == 2) System.exit(1);
            cond = true;
            System.out.println("Enter a color (three values between 0 and 255): ");
            r = sc.nextInt();
            g = sc.nextInt();
            b = sc.nextInt();
            if (r > 255 || r < 0) {
               cond = false;
               System.out.println("The red value " + r + " is out of range");
            }
            if (g > 255 || g < 0) {
               cond = false;
               System.out.println("The green value " + g + " is out of range");
            }
            if (b > 255 || b < 0) {
               cond = false;
               System.out.println("The blue value " + b + " is out of range");
            }
            exitCount++;
        }
        
        Color newColor = new Color(r, g, b);
        return newColor;
    }

    private static void displayColors(Graphics g, Color c1, Color c2, Color c3, Color c4) {
        for (int column = 0; column < 11; column++) {
            for (int row = 0; row < 11; row++) {
                int w1 = (10 - row) * (10 - column);
                int w2 = (10 - row) * column;
                int w3 = row * (10 - column);
                int w4 = row * column;
                
                int r;
                int gr;
                int b;
                
                int v1 = c1.getRed();
                int v2 = c2.getRed();
                int v3 = c3.getRed();
                int v4 = c4.getRed();
                r = (w1 * v1 + w2 * v2 + w3 * v3 + w4 * v4) / (w1 + w2 + w3 + w4);
                
                v1 = c1.getGreen();
                v2 = c2.getGreen();
                v3 = c3.getGreen();
                v4 = c4.getGreen();
                gr = (w1 * v1 + w2 * v2 + w3 * v3 + w4 * v4) / (w1 + w2 + w3 + w4);
                
                v1 = c1.getBlue();
                v2 = c2.getBlue();
                v3 = c3.getBlue();
                v4 = c4.getBlue();
                b = (w1 * v1 + w2 * v2 + w3 * v3 + w4 * v4) / (w1 + w2 + w3 + w4);
                                        
                Color newColor = new Color(r, gr, b);
                g.setColor(newColor);
                g.fillRect(50 * row, 50 * column, 50, 50);
                
            }
        }
    }
}

    
