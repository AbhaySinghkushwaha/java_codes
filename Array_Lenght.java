import java.util.*;
public class Array_Lenght {
    public static void main(String[] args)
    {
        //input
        // int[] arr = {1,2,3,4,5,6,7,87,8,0};
        // System.out.println(arr.length);

        //User input for the array
        
        Scanner cn = new Scanner(System.in);
        int [] arr={};
        System.out.println("Enter the value of n: ");
        int n = cn.nextInt();
        for(int k=0;k<n;k++){
            
            int a= cn.nextInt();
            System.out.println(arr[a]);

        }
       



        // My approuch
        // for(int i=0;i<=10;i++){



        //     System.out.print(" ");
        //     System.out.print(arr[i]);
        // }



        //valid approch
        // for(int i=0;i<= arr.length ;i++ ){
        //     System.out.println(arr[i]);

        // }
        

    

        //Printing the array in reverse order
        // for(int i = arr.length-1 ;i>=0 ;i--)      //For loop architecture 1.initialisation  
        // {                                           //2. set the limit till where the loop will traverse
        //                                             //3.set increament or decreament
        //     System.out.println(arr[i]);
        // }


    }
    
    
}
