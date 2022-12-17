import java.util.Scanner;
public class TrekkingMania {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int allpeople=0;
            int musala=0;
            int monblan=0;
            int kilimanjaro=0;
            int k2=0;
            int everest=0;

            int groupNumber=Integer.parseInt(scanner.nextLine());

            for (int i=1;i<=groupNumber;i++){
                int peopleNumber=Integer.parseInt(scanner.nextLine());
                if (peopleNumber<=5){
                    musala+=peopleNumber;
                } if (peopleNumber>=6&&peopleNumber<13){
                    monblan+=peopleNumber;
                } if (peopleNumber>12&&peopleNumber<26){
                    kilimanjaro+=peopleNumber;
                } if  (peopleNumber>=26&&peopleNumber<=40){
                    k2+=peopleNumber;
                } if (peopleNumber>=41){
                    everest+=peopleNumber;
                }
            } allpeople=monblan+musala+kilimanjaro+k2+everest;
            System.out.printf("%.2f%%%n",musala*1.0/allpeople*100);
            System.out.printf("%.2f%%%n",monblan*1.0/allpeople*100);
            System.out.printf("%.2f%%%n",kilimanjaro*1.0/allpeople*100);
            System.out.printf("%.2f%%%n",k2*1.0/allpeople*100);
            System.out.printf("%.2f%%%n",everest*1.0/allpeople*100);
        }
}
