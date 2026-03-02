/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * Improves modularity by storing banner lines in an array
 * and printing them using a loop.
 */

public class uc4_printOOPS {

    public static void main(String[] args) {

        // 7-line banner
        String[] lines = new String[7];

        lines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  ****** ");

        lines[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ");

        lines[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        lines[3] = String.join(" ",
                " *     * ",
                " *     * ",
                "  ****** ",
                "  *****  ");

        lines[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * ");

        lines[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * ");

        lines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  ");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}