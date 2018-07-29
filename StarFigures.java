/**
 * This is an example class draws the stars
 * specified in BJP4 exercise 1.13
 *
 * @author Jesse Welborn
 */
public class StarFigures {
    /**
     * Starts the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        draw_top();
        System.out.println("");
        draw_middle();
        System.out.println("");
        draw_bottom();
    }

    /**
     * Draws top diagram
     */
    public static void draw_top() {
        draw_solid();
        draw_x();
    }

    /**
     * Draws middle diagram
     */
    public static void draw_middle() {
        draw_solid();
        draw_x();
        draw_solid();
    }

    /**
     * Draws bottom diagram
     */
    public static void draw_bottom() {
        draw_vertical();
        draw_solid();
        draw_x();
    }

    /**
     * Draws two solid rows of asterisks
     */
    public static void draw_solid() {
        draw_row();
        draw_row();
    }

    /**
     * Draws an x shaped group of asterisks
     */
    public static void draw_x() {
        draw_two();
        draw_one();
        draw_two();
    }

    /**
     * Draws a vertical line of asterisks
     */
    public static void draw_vertical() {
        draw_one();
        draw_one();
        draw_one();
    }

    /**
     * Draws a complete row of asterisks
     */
    public static void draw_row() {
        System.out.println("*****");
    }

    /**
     * Draws two asterisks centered around empty space
     */
    public static void draw_two() {
        System.out.println(" * * ");
    }

    /**
     * Draws one centered asterisk.
     */
    public static void draw_one() {
        System.out.println("  *  ");
    }
}
