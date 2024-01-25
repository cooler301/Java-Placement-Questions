import java.util.*;
public class javaBasics{
     /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  Avg
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float sum = a+b+c;
        float avg = sum/3;
        System.out.println(avg); */
         
        /*  Area of square
       float side = sc.nextFloat();
       double area = side*side;
       System.out.println(area);  */
       
       /* user 
       float pencil =sc.nextFloat();
       float pen = sc.nextFloat();
       float eraser = sc.nextFloat();
       double sum = pencil+pen+eraser;
       System.out.println("The total bill " +sum);
       double total = sum+0.18f;
       System.out.println(total); */

       /* Expression 
       byte b = 4;
       char c ='a';
       short s =512;
       int i = 10000;
       float f = 3.14f;
       double d = 99.9954;
       double result = (f*b) + (i%c)-(d*s);
       System.out.println(result);*/

       /* Advanced 
      int $ = 24;
       System.out.println($);*/

     //Largest of two
    /*  System.out.println("Enter the numbers");
     int a = sc.nextInt();
     int b = sc.nextInt();
     if(a>b)
     {
        System.out.println(a + " is greatest than "+ b );
     }
     else{
        System.out.println(b + " is greatest than "+ a );
     }
 */

 //Even and odd

/* System.out.println("Enter the numbers");
     int a = sc.nextInt();
     if(a%2==0)
     {
        System.out.println(a + " is even " );
     }
     else{
        System.out.println(a + " is odd" );
     } */

     // income tax
  /*   int a = sc.nextInt();
     int tax;
     if(a<500000)
     {
        tax = 0 ;
     }
     else if(a>=500000&&a<=1000000){
        tax = (int) (a*0.2);
     }
     else{
        tax=(int) (a*0.3);
     }
     System.out.println("the tax is " +tax);

*/

//Largest of 3 numbers
/* System.out.println("enter the number");

int  a = sc.nextInt();
int  b = sc.nextInt();
int  c = sc.nextInt();


if(a>=b&&a>=c){
    System.out.println("the largest numbers is "+a);

}
else if(b>=c){
   System.out.println("the largest numbers is "+b);
}
else{
    System.out.println("the largsest numbers is" +c);
}

*/


 // ternary variable
 /*int number = 4;
 String a = ((number %2) == 0)? "even" : "odd";
System.out.println(a);*/

//Example 2
/*int marks = sc.nextInt();
String rc = (marks>=33)?"pass":"fail";
System.out.println(rc);*/


// Calculator

/*System.out.println("Enter the numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c;
System.out.println("Enter the switch");
char operator =sc.next().charAt(0);
switch(operator){
    case '+':  c = a+b;
              System.out.println("Addition : " +c); 
              break;
    case '-':  c = a-b;
              System.out.println("Subtraction : " +c); 
              break;
    case '*':  c = a*b;
              System.out.println("Multiplication : " +c); 
              break;
    case '/':  c = a/b;
              System.out.println("Division : " +c); 
              break;
    case '%':  c = a%b;
              System.out.println("Modulus : " +c); 
              break;
    default: System.out.println("Wrong operator");          
}*/
 

// Homework

// postive and negative numbers

/*System.out.println("Enter the number");
int a = sc.nextInt();
String types  = (a>0)?"postive":"negative";
 System.out.println(types);*/

 //tempature
/*System.out.println("enter the temperature");
double temp = sc.nextDouble();
if(temp>101.36)
{
    System.out.println(" have fever");
}
else if(temp == 100){
System.out.println("Normal temp");
}
else{
    System.out.println("low fever");
}*/

//weeks

/*System.out.println("enetr the week number");
int number = sc.nextInt();
switch(number){
    case 1 : System.out.println("Monday");
             break;
    case 2 : System.out.println("Tuesday");
             break;    
    case 3 : System.out.println("Wednesday");
             break;   
    case 4 : System.out.println("Thursday");
             break;
    case 5 : System.out.println("Friday");
             break;  
    case 6 : System.out.println("Saturday");
             break;
    case 7 : System.out.println("Sunday");
             break;                                 
    default: System.out.println("wrong week number");
}*/

//leapyear
/*System.out.println("enterthe leap year");
int leapyear = sc.nextInt();
if(leapyear%4!=0 || leapyear%100!=0 || leapyear%400!=0 )
{
    System.out.print("it is not a leap year");
}
else if(leapyear%4==0 && leapyear%100==0 && leapyear%400==0){
    System.out.print("it is a leap year");
}
else{
    System.out.println("not a leap year");
}*/


/*System.out.println("enter the number");
int number =sc.nextInt();
int count =0;
while(count<=number)
{
   System.out.print(count + " ");
   count++;
}
System.out.println();*/

/*System.out.println("Enter the number");
int n = sc.nextInt();
int count=1;
int c=0;
while(count<=n){
    c +=count;
    count++;
}
System.out.println(c);

*/

//reverse a num
/*System.out.println("Enter the number");
int n = sc.nextInt();
int rev=0;
while(n>0) {
    int lastdigit = n%10;
      rev=(rev*10)+lastdigit;
    //System.out.print(lastdigit);
    n=n/10;
}
System.out.print(rev);*/

// Display all the numbers except multiple of 10
 /*do{
     int n = sc.nextInt();
    if(n %10==0){
        continue;
    }
    System.out.println(n);
 }while(true);

*/

// Prime no
/*System.out.println("Enter the number");
int n = sc.nextInt();

boolean isPrime = true;
if(n==2){
    System.out.println("it is a prime");
}
else{
for(int i=2;i<=Math.sqrt(n);i++){
    if(n %i == 0){
       isPrime = false;
    }
}
 
if(isPrime == true){
 System.out.println(" prime");
}
 else{
 System.out.println("not a prime");
 }

}*/
//own prime
/*int k = sc.nextInt();
if(k==2){
    System.out.println("prime");

}
else
for(int j=2;j<=Math.sqrt(k);k++)
{
    if(k%j==0)
    {
        System.out.println("not a prime");
    }
    else
    {
        System.out.println("prime");
    }
    break;
}*/

//multipliction table
/*System.out.println("enter the number");
int n = sc.nextInt();
System.out.println("enter the no till where u want");
int k = sc.nextInt();
for(int i=0;i<=k;i++){
    int table = n*i;
      System.out.println(+n+"*"+i+"="+table);
    }*/

    // Factorial no
  /*   int fact = 1;
System.out.println("enter the number");
    int n = sc.nextInt();
   for(int i=1;i<=n;i++)
{
    fact*=i;
}
System.out.println(fact);*/

//sum of even and odd
/*int evesum=0;
int oddsum =0;
int choice;
do{
    System.out.println("enter the number");
int n =sc.nextInt();
    if(n%2==0){
        evesum+=n;
    }
    else{
        oddsum+=n;
    }
    System.out.println("print 1 or 0");
    choice=sc.nextInt();
}while(choice==1);
System.out.println(evesum);
System.out.println(oddsum);/*

int num=1;
int k = sc.nextInt();
for(int i=1;i<=k;i++){
    for(int j=1;j<=i;j++){
        System.out.print(num +" ");
        num++;
    }
    System.out.println();
}















//patterns
     int n=4,spaces=3;
    for(int i=1;i<=n;i++){
        for(int j=i;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int k=i;k>=1;k--){
            System.out.print(k);
        }
        for(int z=2;z<=i;z++){
            System.out.print(z);
        }
  System.out.println();
            } 


           /*  int  n =5,k=0 ,s=5;
            for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i+1;j++){
               System.out.print(j);
               }
               for(int j=1;j<=2*i-2;j++){
                  System.out.print("*");
               }
               
               for(int j=n-i+1;j>=1;j--){
               System.out.print(j);
               }
               System.out.println();
            }*/
            
        
        
               

                
                 
                 /*  int n=5;
                   
                    int b = n*2-1;
                 for (int i = 1; i <= n; i++) {
                    for(int j=1;j<=i;j++){
                            System.out.print(" ");
                    }
                            System.out.print("*"+" ");
                    for (int j = 1; j <= (b - 2 * i); j++) {
                        System.out.print(" ");
                    }
                    if (i != n) {
                        System.out.print("*");
                    }
                    System.out.println();
                }*/
                   int n=5;
                int totalWidth = n * 2 - 1;
        
                // Upper half of the pattern
                for (int i = 1; i <= n; i++) {

                    // Print left spaces
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    
                    // Print left edge
                    System.out.print("*");
                    
                    // Print inner spaces
                    for (int j = 1; j <= (totalWidth - 2 * i); j++) {
                        System.out.print(" ");
                    }
                    
                    // Print right edge
                    if (i != n) {
                        System.out.print("*");
                    }
                    
                    System.out.println();
                }
        
                // Lower half of the pattern
                for (int i = n - 1; i >= 1; i--) {
                    // Print left spaces
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    
                    // Print left edge
                    System.out.print("*");
                    
                    // Print inner spaces
                    for (int j = 1; j <= (totalWidth - 2 * i); j++) {
                        System.out.print(" ");
                    }
                    
                    // Print right edge
                    if (i != n) {
                        System.out.print("*");
                    }
                    
                    System.out.println();
                }
                  /* int n=5;
                    int totalWidth = n * 2 - 1;
                for (int i = 1; i <= n; i++) {
                    // Print left edge
                    System.out.print("*");
        
                    // Print inner spaces
                    for (int j = 1; j <= totalWidth - 2; j++) {
                        if (j == totalWidth - i || j == i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
        
                    // Print right edge
                    System.out.print("*");
        
                    System.out.println();
                }*/
               
    }

}
    
