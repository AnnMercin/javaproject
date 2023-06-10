import java.util.Scanner;
 
public class subArray
{
    public static void main(String[] args) 
    {
        //no of elelmets
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int L = scan.nextInt();
        
        //taking the user array input
        int[] arr = new int[L];
        System.out.println("Enter  elements: ");
         for (int i = 0; i < L; i++){
            arr[i] = scan.nextInt();
           }//find the max sum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < L; i++)
        {
            int sum = 0;
            for (int j = i; j < L; j++)
            {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);   
    }
}
