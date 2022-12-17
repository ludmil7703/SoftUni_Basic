import java.util.Scanner;
public class OperationsBetweenNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());
            String operator = scanner.nextLine();
            double result = 0.0;
            String even = "even";
            char del = 37;
            if (operator.equals("+")||operator.equals("-")||operator.equals("*")){
                switch (operator){
                    case "+":
                        result = n1 + n2;
                        break;
                    case "-":
                        result = n1 - n2;
                        break;
                    case "*":
                        result = n1 * n2;
                        break;
                }
                if (result % 2 != 0){
                    even="odd";
                }
                if (operator.equals("+") || operator.equals("-")) {
                    System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, result, even);
                }
                if (operator.equals("*")){
                    System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator,n2, result,even);
                }

            }
            if (operator.equals("/")||operator.equals("%")){
                if (n2 == 0){
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    if (operator.equals("/")){
                        result = n1 / n2;
                        System.out.printf("%.0f %s %.0f = %.2f", n1,operator,n2,result);

                    } else {
                        result = n1 % n2;
                        System.out.printf("%.0f %s %.0f = %.0f", n1,operator,n2,result);
                    }
                }
            }
        }
}
