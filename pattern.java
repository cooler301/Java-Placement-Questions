import java.util.*;

public class pattern {

    // Stars Patterns
 public static void star(int n)
  {
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

 public static void invertedstar(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print("*");
        }
          System.out.println();
    }
  }

 public static void invertedpyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
    }
  }
     
 public static void reveinvertedpyramid(int n){
      for(int i=1;i<=n;i++){
         for(int j=i-1;j>=1;j--){
            System.out.print(" ");
         }
         for(int j=i;j<=n;j++)
         {
            System.out.print("*");
         }

          System.out.println();
      }
     
   }

 public static void hollowrectangle(int r,int c){
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
            if(i==1 || i==r || j==1 || j==c){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
  }

 public static void butterfly(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
  
 public static void solidrhombus(int n){
         for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
            System.out.print("*");
           }
           System.out.println();
        }
  }

 public static void hollowrhombus(int n){
          for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i;j++){
            System.out.print(" ");
           }
           for(int j=1;j<=n;j++){
            if(i==n||i==1||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
  }

 public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

 public static void squarepattern(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
         }
     }

 public static void halfdiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

 public static void diamondhalf1(int n){
        //Upper
       for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       //Lower
          for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
           System.out.println();
     }
     //upper part
     for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
   //lower part
     for(int i=2;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
}

 public static void hollowtriangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==1||i==n||j==1||j==2*i-1)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
    }

    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==1||i==n||j==1||j==2*i-1)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
    }


//hollow big triangle
  for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==1||j==1||j==2*i-1)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
    //lower part
     for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(i==1||j==1||j==2*i-1)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }

    }  




  //Number Patterns

 public static void num_half_pyramid(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
    }
  }

 public static void num_mirror_pyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
  }

 public static void num_inverted_pyramid(int n){
   for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--){
        System.out.print(j);
    }
    System.out.println();
   }
}

 public static void num_rev_inverted_pyramid(int n){
    for(int i=1;i<=n;i++){
         for(int j=i-1;j>=1;j--){
            System.out.print(" ");
        }
        for(int j=n-i+1;j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
    }
}

 public static void floysatriangle(int n)
  {
     int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
  }

 public static void zeronetriangle(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        {
            if((i+j) %2 ==0 )
                System.out.print("1");
           else
           System.out.print("0");
        }
        System.out.println();
      }
  }

 public static void palindrome(int n){
    //upper Part
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
   //Lower part
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
  }

 public static void incrementno(int n){
    int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
 }

 public static void diffnum(int n){
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++)
         {
            System.out.print(i);
         }
         System.out.println();
    }
 }

 public static void trapeziumPattern(int n)
 {

     int num = 1;
     int num2 = (n * n) + 1;
     int spaces = 0;

     // numOfLines is the line number
     for (int i = n; i >= 1;i--) {

         // Prints the spaces for each line
         for (int j = spaces;j >= 1;j--) {
             System.out.print(" ");
         }

         // Prints the first half of the trapezium
         for (int k = 1;k <= i;k++) {

             // If it is the last number for a line then
             // we don't print '*'
             if (k == i)
                 System.out.print((num++));

             else
                 System.out.print((num++) + " ");
         }

         // Prints the second half of the trapezium
         for (int z = 1;z <= i;z++) {
             System.out.print(" " + (num2++));
         }

         System.out.println();

         // Calculates the number of Spaces for the next
         // line
         spaces += 2;

         // Calculates the first number of the
         // second half for the next iteration/line
         num2
             = (num2 - 1) - ((i - 1) * 2);
     }
 }


public static void printUseBinomialExpansion(int n) {
    for (int i= 1;i<= n;i++) {
        for (int j=0; j<= n-i; j++) {
            System.out.print(" ");
        }

        int k = 1;
        for (int z=1;z<=i;z++) {
            System.out.print(k + " ");
            k = k * (i - z) / z;
        }

        System.out.println();
    }
}

public static void numbertraiangle(int n){
  for (int i = 1; i <= n; i++) {
    for(int j=1;j<=i;j++){
        System.out.print(" ");
    }
    for(int j=i;j<=n;j++){
     System.out.print(j+" ");
    }
     System.out.println();
    }
                    
    for (int i=n-1; i>= 1; i--) {
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=i;j<=n;j++){
            System.out.print(j+" ");
        }
    System.out.println();
    }
 }

  public static void numberss(int n){
       // Assuming a square pattern with size 5x5

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                // Calculate the value based on the pattern
                int value;
                if (i % 2 != 0) {
                    // Odd row
                    value = (i - 1) * n + j;
                } else {
                    // Even row
                    value = i * n - j + 1;
                }

                // Print the value with formatting
                System.out.print(String.format("%-3d", value));
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
    
    public static void tcs(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(i);
           if(j<i){
                System.out.print("*");
            }
        }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print(i);
           if(j<i){
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }

     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          //int m =sc.nextInt();
          
          //Start Patterns
          /*System.out.println("Star");
          star(n);*/
          /*System.out.println("inverted star");
          invertedstar(n);*/
          /*System.out.println("pyramid");
          invertedpyramid(n);*/
          /*System.out.println("reverse pyramid");
          reveinvertedpyramid(n);*/
          /*System.out.println("hollow rectangle");
          hollowrectangle(n, m);*/
          /*System.out.println("the butter fly");
          butterfly(n);*/
          /*System.out.println("solid rhombus");
          solidrhombus(n);*/
          /*System.out.println("hollow rhombus");
          hollowrhombus(n);*/
          /*System.out.println("Diamond");
          diamond(n);*/
         /*  System.out.println("square pattern");
          squarepattern(n);*/
          /*System.out.println("half diamond");
          halfdiamond(n);
          //diamondhalf1(n);*/
         /*System.out.println("Hollow Triangle");
             hollowtriangle(n);*/

          //Numbers Pattern

         /*System.out.println("Number Pyramid ");
          num_half_pyramid(n);*/
         /*System.out.println("Inverted Number Pyramid ");
          num_mirror_pyramid(n);*/
         /*System.out.println("the Number inverted pyramid");
          num_inverted_pyramid(n);*/
         /*System.out.println("the rev Number inverted pyramid");
           num_rev_inverted_pyramid(n);*/
         /*System.out.println("Floyd Triangle");
          floysatriangle(n);*/
         /*System.out.println("0 1 Triangle");
          zeronetriangle(n);*/
         /*System.out.println("Palindrome Triangle");
          palindrome(n);*/
         /*System.out.println("Increment no");
         incrementno(n);*/
         /*System.out.println("Same number");
           diffnum(n);*/
         /*System.out.println("Trapezium");
        trapeziumPattern(n);*/
         /*System.out.println("Pascal trainagle");
  printUseBinomialExpansion(n);*/
         /*System.out.println("number triangle");
           numbertraiangle(n);*/
           //numberss(n);
           tcs(n);
        }
}
