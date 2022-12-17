import java.util.Scanner;
public class Building {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int stage=Integer.parseInt(scanner.nextLine());
            int rooms=Integer.parseInt(scanner.nextLine());
            String stageLetter="";

            for (int i=stage;i>=1;--i){
                if (i==stage){
                    stageLetter="L";
                } else if (i%2==0){
                    stageLetter="O";
                } else {
                    stageLetter="A";
                }
                for (int j=0;j<rooms;j++){
                    System.out.printf("%s%d%d ",stageLetter,i,j);
                }
                System.out.println("");
            }
        }
}
