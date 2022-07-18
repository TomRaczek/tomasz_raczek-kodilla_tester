import java.util.Scanner;
public class Colors {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter of a color:");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B": return "BLUE";
                case "Y": return "YELLOW";
                case "R": return "RED";
                case "G": return "GREEN";
                default:
                    System.out.println("Color not found. Try again.");

            }
        }
    }
}
