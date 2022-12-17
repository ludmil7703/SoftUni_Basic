import java.util.Scanner;
public class Balls {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            double point=0;
            int red=0;
            int orange=0;
            int yellow=0;
            int white=0;
            int others=0;
            int countBlack=0;
            double black=0.0;

            int n=Integer.parseInt(scanner.nextLine());

            for (int i=1;i<=n;i++){
                String color= scanner.nextLine();

                if (color.equals("red")){
                    red++;point+=5;
                } else if (color.equals("orange")){
                    orange++;point+=10;
                } else if(color.equals("yellow")){
                    yellow++;point+=15;
                } else if (color.equals("white")){
                    white++;point+=20;
                } else if (color.equals("black")){
                    countBlack++;point=Math.floor(point/2);
                } else {
                    others++;
                }
            }
            System.out.printf("Total points: %.0f%n",point);
            System.out.printf("Red balls: %d%n",red);
            System.out.printf("Orange balls: %d%n",orange);
            System.out.printf("Yellow balls: %d%n",yellow);
            System.out.printf("White balls: %d%n",white);
            System.out.printf("Other colors picked: %d%n",others);
            System.out.printf("Divides from black balls: %d%n",countBlack);

        }
}
