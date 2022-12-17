import java.util.Scanner;
public class EnergyBooster {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String fruit= scanner.nextLine();
            String setSize= scanner.nextLine();
            int number=Integer.parseInt(scanner.nextLine());

            double sum=0.0;
            double price=0.0;
            if (setSize.equals("small")){
                switch (fruit){
                    case "Watermelon":
                        price=2*56;break;
                    case "Mango":
                        price=2*36.66;break;
                    case "Pineapple":
                        price=2*42.10;break;
                    case "Raspberry":
                        price=2*20;break;
                    default:break;
                }
            } else if(setSize.equals("big")){
                switch (fruit) {
                    case "Watermelon":
                        price = 5*28.70;
                        break;
                    case "Mango":
                        price = 5*19.60;
                        break;
                    case "Pineapple":
                        price = 5*24.80;
                        break;
                    case "Raspberry":
                        price = 5*15.20;break;
                    default:
                        break;
                }
            }
            sum=number*price;
            if (sum>=400&&sum<=1000){
                sum=sum-sum*0.15;
            } else if(sum>1000){
                sum=sum-sum*0.5;
            }
            System.out.printf("%.2f lv.",sum);
        }
}
