import java.util.Scanner;
public class Moving {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            int wide=Integer.parseInt(scanner.nextLine());
            int large=Integer.parseInt(scanner.nextLine());
            int high=Integer.parseInt(scanner.nextLine());
            int cube=wide*large*high;
            boolean isLeft=true;


            String input= scanner.nextLine();

            while (!input.equals("Done")){
                int count=Integer.parseInt(input);
                cube-=count;
                if (cube<0){
                    isLeft=false;
                    break;
                }

                input= scanner.nextLine();
            }
            if (isLeft){
                System.out.printf("%d Cubic meters left.",cube);
            } else {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(cube));
            }
        }
}
