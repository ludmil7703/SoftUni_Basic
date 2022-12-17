import java.util.Scanner;
public class VowelsSum {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input= scanner.nextLine();
            int value=0;
            int sum=0;
            for (int i=1;i<input.length();i++) {
                char letter = input.charAt(i);
                switch (letter) {
                    case 'a':
                        value = 1;
                        break;
                    case 'e':
                        value = 2;
                        break;
                    case 'i':
                        value = 3;
                        break;
                    case 'o':
                        value = 4;
                        break;
                    case 'u':
                        value = 5;
                        break;
                    default:
                        value=0;

                } sum = sum + value;
            }System.out.println(sum);
        }
}
