import java.util.Scanner;
public class SumOfTwoNumbers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int begin=Integer.parseInt(scanner.nextLine());
            int end=Integer.parseInt(scanner.nextLine());
            int magicNumber=Integer.parseInt(scanner.nextLine());
            int firstNum=begin;
            int secondNum=begin;
            int comb=0;
            boolean isFound=false;

            for (int i=begin;i<=end;i++){
                for (int j=begin;j<=end;j++){
                    comb++;
                    if (i+j==magicNumber){
                        isFound=true;
                        break;
                    }
                    secondNum=j+1;
                }
                if (isFound){
                    break;
                }
                firstNum=i+1;
            }
            if (isFound){
                System.out.printf("Combination N:%d (%d + %d = %d) ",comb,firstNum,secondNum,magicNumber);
            } else {
                System.out.printf("%d combinations - neither equals %d",comb,magicNumber);
            }
        }
}
