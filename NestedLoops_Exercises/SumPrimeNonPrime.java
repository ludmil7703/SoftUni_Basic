import java.util.Scanner;
public class SumPrimeNonPrime {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int primeSum=0;
            int nonPrimeSum=0;
            boolean isNegative=false;
            String input= scanner.nextLine();

            while (!input.equals("stop")){

                int number=Integer.parseInt(input);
                if (number<0){
                    System.out.println("Number is negative.");
                    isNegative=true;

                }
                if (!isNegative) {
                    int count = 0;
                    for (int i = 1; i <= number; i++) {

                        if (number % i == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        primeSum += number;
                    } else {
                        nonPrimeSum += number;
                    }
                }
                isNegative=false;

                input= scanner.nextLine();
            }
            System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
            System.out.printf("Sum of all non prime numbers is: %d%n",nonPrimeSum);
        }
}
