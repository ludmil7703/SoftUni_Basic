import java.util.Scanner;
public class Histogram {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n =Integer.parseInt(scanner.nextLine());
            int sum1=0;
            int sum2=0;
            int sum3=0;
            int sum4=0;
            int sum5=0;
            char letter=37;
            for (int i=0;i<n;i++){
                int number=Integer.parseInt(scanner.nextLine());
                if (number<200){
                    sum1+=1;
                }
                if (number>=200&&number<=399){
                    sum2+=1;
                }
                if (number>=400&&number<=599){
                    sum3+=1;
                }
                if (number>=600&&number<800){
                    sum4+=1;
                }
                if (number>=800){
                    sum5+=1;
                }
            }
            System.out.printf("%.02f%s%n",sum1*1.00/n*100,letter);
            System.out.printf("%.02f%s%n",sum2*1.00/n*100,letter);
            System.out.printf("%.02f%s%n",sum3*1.00/n*100,letter);
            System.out.printf("%.02f%s%n",sum4*1.00/n*100,letter);
            System.out.printf("%.02f%s%n",sum5*1.00/n*100,letter);

        }
}
