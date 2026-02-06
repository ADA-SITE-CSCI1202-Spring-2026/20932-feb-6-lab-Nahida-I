import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total seconds: ");
        int tSeconds = sc.nextInt();

        int hours = tSeconds / 3600;
        int remaining = tSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        sc.close();
    }
}
