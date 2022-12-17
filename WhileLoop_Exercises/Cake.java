import java.util.Scanner;
public class Cake {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int x=Integer.parseInt(scanner.nextLine());
            int y=Integer.parseInt(scanner.nextLine());
            int pieces=x*y;
            boolean isLeft=false;

            String input= scanner.nextLine();

            while(!input.equals("STOP")){
                int takenPieces=Integer.parseInt(input);
                pieces-=takenPieces;

                if (pieces<0){
                    break;
                }
                input= scanner.nextLine();
            }
            if (pieces<0){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
            } else {
                System.out.printf("%d pieces are left.",pieces);
            }
        }
}
