import java.util.*;
public class Ston_paper_scissor {
    public static void main(String[] args)
    {
        Scanner cn = new Scanner(System.in);
        Random a = new Random(); 
        int b = a.nextInt(3);
        
        System.out.println("Enter 0 for stone\n ,1 for scissor\n , 2 for paper\n");
        int c = cn.nextInt();

        //Inputs by user and computer respectively
        System.out.println(b);
        System.out.println(c);
        

        if (b==c){
            System.out.println("Draw");
            
        } else{
            switch(b){
                case 0: 
                if(c==1){
                    System.out.println("Computer won!");
                }
                else{
                    System.out.println("You won!");
                }
                break;

                case 1:
                if(c==2){
                    System.out.println("computer won!");

                }
                else{
                    System.out.println("You won!");
                }
                break;

                case 2:
                if(c==0){
                    System.out.println("computer won!");
                }
                else {
                    System.out.println("You won!");
                }
                break;

            }
        }

    }
    
}

