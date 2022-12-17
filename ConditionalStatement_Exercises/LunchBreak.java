import java.util.Scanner;
public class LunchBreak {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String imeSerial= scanner.nextLine();
            int timeEpisode = Integer.parseInt(scanner.nextLine());
            int timeBreak = Integer.parseInt(scanner.nextLine());
            double lunchTime = timeBreak/8.00;
            double relaxTime = timeBreak/4.00;
            double timeLeft = timeBreak - (lunchTime + relaxTime);
            if (timeLeft>=timeEpisode) {
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", imeSerial, Math.ceil(timeLeft-timeEpisode));

            } else {
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", imeSerial, Math.ceil(timeEpisode - timeLeft));
            }
        }
}
