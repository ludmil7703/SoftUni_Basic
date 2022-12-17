import java.util.Scanner;
public class OnTimeForExam {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hourExam=Integer.parseInt(scanner.nextLine());
            int minuteExam=Integer.parseInt(scanner.nextLine());
            int hourArrival=Integer.parseInt(scanner.nextLine());
            int minuteArrival=Integer.parseInt(scanner.nextLine());
            int examMinute= hourExam*60+minuteExam;
            int arrivalMinute=hourArrival*60+minuteArrival;
            int diff=Math.abs(examMinute-arrivalMinute);
            int hour =diff/60;
            int min = diff%60;

            if(examMinute<arrivalMinute){
                System.out.println("Late");
                if (diff<=59){
                    System.out.printf("%d minutes after the start", diff);
                } else {
                    System.out.printf("%d:%02d hours after the start", hour, min);
                }
            }else if (examMinute==arrivalMinute||diff<=30){
                System.out.println("On time");
                if (diff!=0){
                    System.out.printf("%d minutes before the start", diff);
                }
            } else {
                System.out.println("Early");
                if (diff<=59) {
                    System.out.printf("%d minutes before the start", diff);
                }else {
                    System.out.printf("%d:%02d hours before the start", hour, min);
                }
            }
        }
}
