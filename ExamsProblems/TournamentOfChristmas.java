import java.util.Scanner;
public class TournamentOfChristmas {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double sum=0;
            int dayWin=0;
            int countWin=0;
            int countLose=0;
            int wins=0;
            int lose=0;

            int days=Integer.parseInt(scanner.nextLine());


            for (int i=1;i<=days;i++) {
                String sport = scanner.nextLine();


                while (!sport.equals("Finish")) {
                    String game = scanner.nextLine();

                    if (game.equals("win")) {
                        dayWin += 20;
                        countWin++;
                    } if (game.equals("lose")){
                        countLose++;
                    }

                    sport = scanner.nextLine();
                }
                if (countWin>countLose){
                    sum+=dayWin+dayWin*0.1;
                } else {
                    sum+=dayWin;
                }
                wins+=countWin;
                lose+=countLose;
                countLose=0;countWin=0;dayWin=0;
            }
            if (wins>lose){
                sum=sum+sum*0.2;
                System.out.printf("You won the tournament! Total raised money: %.2f",sum);
            } else {
                System.out.printf("You lost the tournament! Total raised money: %.2f",sum);
            }
        }
}
