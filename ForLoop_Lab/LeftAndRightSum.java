import java.util.Scanner;
public class LeftAndRightSum {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int leftSum=0;
            int rightSum=0;
            int n=Integer.parseInt(scanner.nextLine());
            for (int i=0;i<n;i++){
                int num=Integer.parseInt(scanner.nextLine());
                leftSum+=num;
            }
            for (int i=0;i<n;i++){
                int num=Integer.parseInt(scanner.nextLine());
                rightSum+=num;

            } if (leftSum==rightSum){
                System.out.printf("Yes, sum = %d",leftSum);
            } else {
                System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
            }
        }
}
