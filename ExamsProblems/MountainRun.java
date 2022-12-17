import java.util.Scanner;
public class MountainRun {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            double record=Double.parseDouble(scanner.nextLine());
            double meters=Double.parseDouble(scanner.nextLine());
            double secondsPerMeters=Double.parseDouble(scanner.nextLine());

            double resistance=Math.floor(meters/50)*30;

            double georgi=meters*secondsPerMeters+resistance;
            if (georgi<record){
                System.out.printf("Yes! The new record is %.2f seconds.",georgi);
            } else {
                System.out.printf("No! He was %.2f seconds slower.",(georgi-record));
            }

        }
}
