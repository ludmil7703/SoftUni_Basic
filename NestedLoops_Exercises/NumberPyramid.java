import java.util.Scanner;
public class NumberPyramid {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int current=1;
            boolean isBigger=false;

            int n=Integer.parseInt(scanner.nextLine());

            for (int rows=1;rows<=n;rows++){
                for (int cols=1;cols<=rows;cols++){
                    if (current>n){
                        isBigger=true;
                        break;
                    }
                    System.out.print(current+" ");
                    current++;
                }
                if (isBigger){
                    break;
                }
                System.out.println();
            }
        }
}
