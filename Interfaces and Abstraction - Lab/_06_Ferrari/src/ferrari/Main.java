package ferrari;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String driverName = scanner.nextLine();
        Ferrari ferrari = new Ferrari(driverName);
        String string = ferrari.toString();
        System.out.println(string);
    }
}