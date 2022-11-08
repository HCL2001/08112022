import java.util.Scanner;

public class ChangeTemper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.print("Moi ban chon: ");
        int choice = sc.nextInt();
        double F;
        double C;
        while (choice != 0){
            switch (choice){
                case 1:
                    System.out.print("Moi nhap Fahrenheit ");
                    F = sc.nextDouble();
                    System.out.print("Celsius la: " + fahrenheitToCelsius(F));
                    break;
                case 2:
                    System.out.print("Moi nhap Celsius ");
                    C = sc.nextDouble();
                    System.out.print("Fahrenheit la: " + celsiusToFahrenheit(C));
                    break;
                default:
                    System.out.print("Nhap khong hop le!!");
                    break;
            }
            System.out.print("\nMoi ban chon tiep: ");
            choice = sc.nextInt();
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        double f = (5.0 / 9) * (celsius + 32);
        return f;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double c = (5.0 / 9) * (fahrenheit + 32);
        return c;
    }
}
