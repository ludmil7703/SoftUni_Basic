import java.util.Scanner;
public class AluminumJoinery {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int numberJoinery=Integer.parseInt(scanner.nextLine());
            String kindJoinery= scanner.nextLine();
            String delivery= scanner.nextLine();
            int price=0;
            double allprice=0.0;

            switch (kindJoinery){
                case "90X130":
                    price=110;
                    if (numberJoinery>=30&&numberJoinery<60){
                        allprice=price*numberJoinery-price*numberJoinery*0.05;
                    }else if (numberJoinery>=60){
                        allprice=price*numberJoinery-price*numberJoinery*0.08;
                    } else {
                        allprice=numberJoinery*price;
                    }
                    break;
                case "100X150":
                    price=140;
                    if (numberJoinery>=40&&numberJoinery<80){
                        allprice=price*numberJoinery-price*numberJoinery*0.06;
                    }else if (numberJoinery>=80){
                        allprice=price*numberJoinery-price*numberJoinery*0.1;
                    }else {
                        allprice=numberJoinery*price;
                    }break;
                case "130X180":
                    price=190;
                    if (numberJoinery>=20&&numberJoinery<50){
                        allprice=price*numberJoinery-price*numberJoinery*0.07;
                    }else if (numberJoinery>=50){
                        allprice=price*numberJoinery-price*numberJoinery*0.12;
                    }else {
                        allprice=numberJoinery*price;
                    }break;

                case "200X300":
                    price=250;
                    if (numberJoinery>=25&&numberJoinery<50){
                        allprice=price*numberJoinery-price*numberJoinery*0.09;
                    }else if (numberJoinery>=50){
                        allprice=price*numberJoinery-price*numberJoinery*0.14;
                    } else {
                        allprice=numberJoinery*price;
                    }break;
                default:break;
            }
            if (delivery.equals("With delivery")) {
                allprice=allprice+60;
            }
            if (numberJoinery>=99){
                allprice=allprice-allprice*0.04;
            }
            if (numberJoinery<=10){
                System.out.println("Invalid order");
            } else {
                System.out.printf("%.2f BGN",allprice);
            }
        }
}
