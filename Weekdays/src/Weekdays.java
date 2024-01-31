import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter the day position(0-6)");
            int dayPosition = scanner.nextInt();

            if (dayPosition >= 0 && dayPosition <= 6) {
                String dayName = weekdays[dayPosition];
                System.out.println("day position" + dayPosition + "=" + dayName);
            } else {
                System.out.println("Error should between 0 and 6");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please enter a valid day position.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");

        } finally {
            scanner.close();
        }
    }
}

