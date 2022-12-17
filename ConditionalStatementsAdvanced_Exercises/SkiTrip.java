import java.util.Scanner;
public class SkiTrip {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int day =Integer.parseInt(scanner.nextLine());
            String room = scanner.nextLine();
            String grade= scanner.nextLine();
            day=day-1;
            double price=0.0;
            double discount=0.0;
            switch (room){
                case "room for one person":
                    price=18.00;break;
                case "apartment":
                    price=25;
                    if (day<10){
                        discount=0.3;
                    }
                    if (day>=10&&day<=15){
                        discount=0.35;
                    } if (day>15) {
                    discount=0.5;
                }break;
                case "president apartment":
                    price=35.00;
                    if (day<10){
                        discount=0.1;
                    }
                    if (day>=10&&day<=15){
                        discount=0.15;
                    } else {
                        discount=0.2;
                    }break;
            }
            double allprice=day*(price-price*discount);
            if (grade.equals("positive")){
                allprice=allprice+allprice*0.25;
            } else {
                allprice=allprice-allprice*0.1;
            }
            System.out.printf("%.2f",allprice);

        }
}
