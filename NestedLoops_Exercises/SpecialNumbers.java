import java.util.Scanner;
public class SpecialNumbers {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int N=Integer.parseInt(scanner.nextLine());

            for (int i=1111;i<=9999;i++){
                int count=0;
                String currentNumber=(""+i);
                for (int j=0;j<4;j++){
                    int number =Integer.parseInt(""+currentNumber.charAt(j));
                    if (number==0){
                        break;
                    }
                    if (N%number==0){
                        count++;
                    } else {
                        break;
                    }
                    if (count==4){
                        System.out.print(i+" ");
                    }
                }
            }
        }
}
