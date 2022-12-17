import java.util.Scanner;
public class BarcodeGenerator {
            public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int num1=Integer.parseInt(scanner.nextLine());
            int num2=Integer.parseInt(scanner.nextLine());



            int n1=(num1/1000)%10;int n2=(num1/100)%10;int n3=(num1/10)%10;int n4=num1%10;
            int m1=(num2/1000)%10;int m2=(num2/100)%10;int m3=(num2/10)%10;int m4=num2%10;

            for (int i=n1;i<=m1;i++){
                for (int j=n2;j<=m2;j++){
                    for (int k=n3;k<=m3;k++){
                        for (int l=n4;l<=m4;l++){
                            if (i%2!=0&&j%2!=0&&k%2!=0&&l%2!=0) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
}
