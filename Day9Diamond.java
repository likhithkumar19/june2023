import java.util.Scanner;
     class Diamond
    {
        public static void main(String args[]) 
        {
            int n, i, j, space = 1;
          System.out.print("Enter the number of rows:");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            space = n - 1;
            for (j = 1; j <= n; j++) 
            {
                for (i = 1; i <= space; i++) 
                {
                    System.out.print("#");
                }
                space--;
                for (i = 1; i <=j ; i++) 
                {
                    System.out.print("*");                
                }
                System.out.println("");
            }
   }   }
            