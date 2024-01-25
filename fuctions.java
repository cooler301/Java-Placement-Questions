import java.util.*;
public class fuctions {
/*
    public static int fact (int n)
    {
         int f=1;
         for(int i=1;i<=n;i++){
            f*=i;
         }
         return f;
    }

    public static int biocoff(int n,int r){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        int coff = a/(b*c);
        return coff;
    }

    public static int somofno(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
             rev = (rev*10)+lastdigit;
            n=n/10;
        }
        return  rev;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the numbers");
         int n =sc.nextInt();
         int r =sc.nextInt();
          int k =sc.nextInt();
         int fa = fact(n);
         System.out.println("The factorial of"+" "+ n +" "+"is"+" "+fa);
         int bioncoff = biocoff(n, r);
         System.out.println("The bionomail coffiecent of"+" "+ n +" "+ r +" "+"is"+" "+bioncoff);
         int sumofnums = somofno(n);
         System.out.println("the sum of number is "+sumofnums);
         int rever = reverse(k);
         System.out.println("nThe reverse of number "+rever);
        }
    }
*/


//Optimize prime,inrangeprime,dectobi,bitodec


public static  boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<Math.sqrt(n);i++)
    {
        if(n%i==0){
            return false;
        }
    }
    return true;
}

public static void isRangePrime(int a,int b)
{
     for(int i=a;i<=b;i++){
        int sum=0;
        if(isPrime(i)){
            sum = sum+i;
     }
     System.out.print(sum+" ");
    }
}

//bi to dec

public static int bitodec(int n){
    int pows=0,div=0;
    while(n>0){
        int lastdigit=n%10;
        div=div+(lastdigit*(int)Math.pow(2,pows));
        pows++;
        n=n/10;
    }
    return div;
}

//dec to bi
public static int dectobi(int n)
{
    int pow=0,div=0;
    while(n>0){
        int rem=n%2;
        div = div+(rem* (int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    return div;
}
 public static int add(int a,int b,int c){
    int sum = a+b+c;
    int avg = sum/3;
    return avg;
 }

 public static boolean iseven(int n){
    if(n%2==0){
        System.out.println("even");
        return true;
    }
    System.out.println("odd");
    return false;
 }
 
 public static void palindrom(int n){
    int pali = n;
    int rev=0;
    while(pali>0){
        int lastd = pali%10;
        rev=(rev*10)+lastd;
        pali=pali/10;
    }
    System.out.println(rev);
    if(rev == n)
    System.out.println("this is palindrom");
    else
    System.out.println("not a palindrome");
 }

 public static int  sumofin(int n)
 {
    int sum=0;
    while(n>0){
        int lastdi = n%10;
        sum+=lastdi;
        n=n/10;
    }
    
return sum;
 }

 
public static int btod(String n2){
    int div=0,pow =0;
    for(int i=n2.length()-1;i>=0;i--){
    char c = n2.charAt(i);
        div = div+((int) c - (int) '0') *(int)Math.pow(2,pow++);
    }
    return div;
}
 
public static int dtoO(int n3){
      int i=0;
      String octal = "";
      while(n3 > 0){
        i = n3 % 8;
        octal = i + octal;
        n3= n3 / 8;
      }
      
      return Integer.parseInt(octal);
}   

public static int btoO(String bi)
{
    int dec = btod(bi);
    int oc = dtoO(dec);
    return oc;

}
public static int btodd(int n3){
       int div=0,pows=0;
       while(n3>0){
        int l = n3 % 10;
        div += l*Math.pow(2,pows);
        pows++;
        n3= n3 / 10;
       }
       return div;
}

public static int dtobb(int n4){
    int div=0,pows=0;
    while(n4>0){
     int l = n4 % 2;
     div += l*(int)Math.pow(10,pows);
     pows++;
     n4= n4 / 2;
    }
    return div;
}

public static int otod(int n3){
    int div=0,pow=0;
    while (n3>0) {
        int l = n3 % 10;
        div += l*Math.pow(8,pow);
        pow++;
        n3 = n3/10;
        
    }
    return div;
}

public static int octobi(int n5){
    int oc = otod(n5);
    int d = dtobb(oc);
     return d;
}

public static int fact(int n){
    if(n==0){
        return 1;
    }
    else{
        return n *fact(n-1);
    }
}




public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       //String binary = sc.nextLine();
        isRangePrime(n,m);
        //System.out.println(bitodec(n));
        //System.out.println(dectobi(n));
        //System.out.println(add(n,m,t));
        //iseven(n);
        //palindrom(n);
    //System.out.println("the sum of "+n+" "+sumofin(n));
    //System.out.println(btoO(binary));
    //System.out.println(fact(n));

  }
}



