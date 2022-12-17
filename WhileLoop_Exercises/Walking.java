import java.util.Scanner;
public class Walking {
         public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            boolean isStop=true;
            int steps=0;
            int sum=0;
            while (sum<10000){
                String input= scanner.nextLine();
                if (input.equals("Going home")){
                    steps=Integer.parseInt(scanner.nextLine());
                    sum+=steps;
                    isStop=false;
                    break;
                }
                steps=Integer.parseInt(input);
                sum+=steps;
            }
            if (isStop||sum>=10000){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sum-10000);
            }else {
                System.out.printf("%d more steps to reach goal.", 10000-sum);
            }
        }
}
