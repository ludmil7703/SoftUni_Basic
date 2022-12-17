import java.util.Scanner;
public class CinemaTickets {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String filmName= scanner.nextLine();
            int freePlaces=Integer.parseInt(scanner.nextLine());
            int allstudent=0;
            int allstandard=0;
            int allkid=0;
            int student=0;
            int standard=0;
            int kid=0;


            while (!filmName.equals("Finish")){


                for (int i=1;i<=freePlaces;i++){

                    String ticket= scanner.nextLine();


                    if (ticket.equals("End")){

                        break;
                    }
                    switch (ticket){
                        case "student":
                            student++;
                            break;
                        case "standard":
                            standard++;

                            break;
                        case "kid":
                            kid++;

                            break;
                        default:break;
                    }
                }
                System.out.printf("%s - %.2f%% full.%n",filmName,((student+standard+kid)*1.0/freePlaces*100));
                allstudent+=student;
                allstandard+=standard;
                allkid+=kid;
                student=0;
                standard=0;
                kid=0;


                filmName= scanner.nextLine();
                if (filmName.equals("Finish")){
                    break;
                }
                freePlaces=Integer.parseInt(scanner.nextLine());
            }
            int alltickets=allkid+allstandard+allstudent;
            System.out.printf("Total tickets: %d%n",alltickets);
            System.out.printf("%.2f%% student tickets.%n",allstudent*1.0/alltickets*100);
            System.out.printf("%.2f%% standard tickets.%n",allstandard*1.0/alltickets*100);
            System.out.printf("%.2f%% kids tickets.%n",allkid*1.0/alltickets*100);
        }
}
