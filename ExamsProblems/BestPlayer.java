import java.util.Scanner;
public class BestPlayer {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String bestPlayer="";
            int maxGoals=0;

            String namePlayer= scanner.nextLine();
            int goals=Integer.parseInt(scanner.nextLine());

            while (!namePlayer.equals("END")){
                if (goals>maxGoals){
                    maxGoals=goals;
                    bestPlayer=namePlayer;
                }
                if (goals>=10){
                    break;
                }

                namePlayer= scanner.nextLine();
                if (namePlayer.equals("END")){
                    break;
                }
                goals=Integer.parseInt(scanner.nextLine());

            }
            System.out.printf("%s is the best player!%n",bestPlayer);
            if (maxGoals>=3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!%n",maxGoals);
            } else {
                System.out.printf("He has scored %d goals.",maxGoals);
            }
        }
}
