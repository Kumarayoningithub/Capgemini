package polymorphism;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k;

        do {
            System.out.println("\nChoose your option:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            k = sc.nextInt();

            switch (k) {

                case 1:
                    System.out.println("Give side:");
                    double side = sc.nextDouble();
                    System.out.println("Area = " +
                            AreaCalculator.CalculateArea(side));
                    break;

                case 2:
                    System.out.println("Give length & breadth:");
                    double length = sc.nextDouble();
                    double breadth = sc.nextDouble();
                    System.out.println("Area = " +
                            AreaCalculator.CalculateArea(length, breadth));
                    break;

                case 3:
                    System.out.println("Give radius:");
                    float radius = sc.nextFloat();
                    System.out.println("Area = " +
                            AreaCalculator.CalculateArea(radius));
                    break;

                case 4:
                    System.out.println("Exit selected. Program stopped.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (k != 4);

        sc.close();
    }
}
