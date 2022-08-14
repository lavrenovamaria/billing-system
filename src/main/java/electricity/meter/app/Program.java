package electricity.meter.app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код плательщика: ");
        Long id = scan.nextLong();
        System.out.println("Введите период показаний[MMYYYY]: ");
        Integer period = scan.nextInt();
        System.out.println("Введите показания счетчика [кВт/ч]: ");
        Double data = scan.nextDouble();
        System.out.println("Id: " + id + "\nPeriod: " + period + "\nData: " + data);

    }
}
