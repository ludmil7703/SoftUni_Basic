import java.util.Scanner;
public class MinNumber {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            String number= scanner.nextLine();
            while (!number.equals("Stop")){
                int currentNumber=Integer.parseInt(number);
                if (currentNumber<min) {
                    min = currentNumber;
                }
                number= scanner.nextLine();
            }System.out.println(min);
        }
}
