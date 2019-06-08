import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Year: ");
        int an = scanner.nextInt();

        /*
        if (an%4==0 && (an%100==0 && an%400!=0)) {
            if (an%100==0 && an%400!=0){
                System.out.println("Nu e an bisect.");
            } else System.out.println("An bisect");
        } else System.out.println("Nu e an bisect");

        */

        // altfel spus

        if ((an%4==0 && an%100!=0) || an%400==0){
            System.out.println("An bisect");
        } else {
            System.out.println("Nu e an bisect");
        }

        // cel mai simplu:        System.out.println(Year.isLeap(an));

    }
}
