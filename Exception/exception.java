import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {


        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            try {
                int x = s.nextInt();
                int y = s.nextInt();
                System.out.println(x / y);
            }
            catch(ArithmeticException | InputMismatchException e) {
                if (e instanceof ArithmeticException) {
                    System.out.println("java.lang.ArithmeticException: / by zero");
                } else if (e instanceof InputMismatchException){
                    System.out.println("java.util.InputMismatchException");
                }
            }

        }

}
