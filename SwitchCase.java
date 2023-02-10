import java.util.*;
public class SwitchCase {
        public static void main(String_1[] args) {
            Scanner cn = new Scanner(System.in);
            System.out.print("Enter number of day between 1 to 7: ");
            int day = cn.nextInt();
            String_1 a ;

            switch (day)
            {
                case 1: 
                   a = "Monday";
                break;

                case 2: 
                   a = "Tuesday";
                break;

                case 3: 
                   a = "Wednesday";
                break;

                case 4: 
                   a = "Tursday";
                break;

                case 5: 
                   a = "Friday";
                break;

                case 6: 
                   a = "Satday";
                break;

                case 7: 
                   a = "Sunday";
                break;

                default:
                   a = "Invalid day";
            }

            System.out.println(a);
            
        }

    
}
