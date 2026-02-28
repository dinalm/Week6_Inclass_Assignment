import java.util.Scanner;

public class TripCalculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed in km/h: ");
        double speed = scanner.nextDouble();
        System.out.println("Enter time in hours: ");
        double time = scanner.nextDouble();
        double distance = calculatDistance(speed, time);
        System.out.println("The distance traveled is: " + distance + " km");


    }
    public static double calculatDistance(double speed, double time){
        return speed * time;
    }
}
