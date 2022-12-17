import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deposirana suma -");
        double deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("Srok na deposita");
        int srok = Integer.parseInt(scanner.nextLine());
        System.out.println("Godishen lihven procent");
        double yearsPercent = Double.parseDouble(scanner.nextLine());
        double lihva = deposit * (yearsPercent / 100);
        double lihvaMonth = lihva / 12;
        double suma = deposit + srok * lihvaMonth;
        System.out.println(suma);
    }
}