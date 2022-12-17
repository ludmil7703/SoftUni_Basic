import java.util.Scanner;
public class MaxNumber {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int max = Integer.MIN_VALUE;
            String number= scanner.nextLine();
            while (!number.equals("Stop")){
                int currentNumber=Integer.parseInt(number);
                if (currentNumber>max) {
                    max = currentNumber;
                }
                number= scanner.nextLine();
            }System.out.println(max);
        }
}
