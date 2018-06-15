import java.util.Scanner;
/** ScannerControl checks the correctness of information input. */

public class ScannerControl {
    Scanner scanner=new Scanner(System.in);
/** ScannerControl checks whether the number is correct.
 * If the number is not entered correctly, prompts to enter again*/
    public Integer enterNumber(){
        Integer number;
        while (!scanner.hasNextInt()){
            System.out.println("Напишите число правильно. ");
            scanner.next();
        }
        number=scanner.nextInt();
        return number;
    }
}
