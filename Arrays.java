import java.util.*;

public class Arrays {

     //Linear Search
    public static int linerSearch(int number[],int key){
             for(int i=0;i<number.length;i++){
                if(number[i]==key)
                    return i;
             }

             return -1;
    }

    //Binary Search
    public static int BinarySearch(int number[],int key){
        int start =0,end = number.length-1;
        while(start<=end){
             int mid = (start+end)/2;
             if(number[mid]==key){
             return mid;
             }
            else if(number[mid]< key){
               start=mid+1;
            }
            else{
               end= mid-1;        
        }
    }
        return   -1;
    }
 
    //Reverse Array
    public static void reversearray(int number[]){
        int start=0,end=number.length-1;
         while(start < end){
         int temp = number[start];
         number[start] = number[end];
         number[end] = temp;

         start++;
         end--;
         }
    }

    //Get largest
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                 largest = number[i];
            }
        }
        return largest;
   }
 
   //Pairs
   public static void pairs(int number[]){
    for(int i=0;i<number.length;i++){
        int curr = number[i];
        for(int j=i+1;j<number.length;j++){
            System.out.print("("+curr+","+number[j]+")");
        }
        System.out.println();

    }
         System.out.println("Total:"+(number.length*(number.length+1))/2);
   }

   //Subarray
     public static void subarray(int number[]){
             int start,end,sum=0,a;
             for(int i=0;i<number.length;i++){
                start=i;
                for(int j=i;j<number.length;j++){
                    end =j;
                       sum=0;
                    for(int k=start;k<=end;k++)
                    { 
                       System.out.print(number[k]+" ");;
                     
                    }
                    System.out.println();
                }
                System.out.println();
             }
             System.out.println("Total:"+(number.length*(number.length+1))/2);
     }

     //maxsub nrml
   public static void minmaxsub(int number[]){
                 int start =0 ,end = number.length-1;
                 int  currsum=0;
                 int maxsum=Integer.MIN_VALUE;
                 int minsum=Integer.MAX_VALUE;
                 for(int i=0;i<number.length;i++){
                  start=i;
                  for(int j=i;j<number.length;j++){
                     end=j;
                     currsum=0;
                     for(int k=start;k<=end;k++){
                        System.out.print(number[k]+" ");
                        currsum +=number[k];
                     }
                     System.out.println("="+currsum);
                     if(maxsum<currsum){
                        maxsum=currsum;
                    }
                    else if(minsum>currsum){
                     minsum=currsum;
                    }
                  }
               }
            
            System.out.println("the maxsubsum is"+maxsum);
            System.out.println("the min sum is"+minsum);
            System.out.println("the total no of subarray is"+(number.length*(number.length+1))/2);
  }

   
            //prefix
         public static void prefixsub(int number[]){
            int start=0,end=number.length-1,currsum;
            int minsum=Integer.MAX_VALUE;
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int [number.length];
            prefix[0]=number[0];
            for(int i=1;i<prefix.length;i++)
            {
              prefix[i] = prefix[i-1] + number[i];
            }

             for(int i=0;i<number.length;i++){
                  start=i;
                  for(int j=i;j<number.length;j++){
                     end=j;
                     currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                     if(maxsum<currsum){
                        maxsum=currsum;
                    }
                    else if(minsum>currsum){
                     minsum=currsum;
                    }
                  }
               }
               System.out.println("the maxsubsum is"+maxsum);
            System.out.println("the min sum is"+minsum);
         }

           //chatgptkadanes
         public static void kadanes(int number[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
          for(int i=0;i<number.length;i++){
               cs =Math.max( number[i],cs+number[i]);
               ms = Math.max(cs, ms);
            }
            System.out.println("the max sum "+ms);
         }

         //own
      public static void kadanesown(int number[]){
            int ms = Integer.MIN_VALUE;
            int cs=0;
            boolean allnegative =true;
            for(int num:number){
               if(num>=0){
                  allnegative=false;
                  break;
               }
               ms= Math.max(ms, num);
            }
            if(allnegative){
               System.out.println("the max is"+ms);
               return;
            }
            for(int i=0;i<number.length;i++){
               cs = cs+number[i];
               if(cs<0){
                  cs=0;
               }
               ms = Math.max(cs, ms);
         }
         System.out.println("the max"+ms);
      }
   
        //Trapping water
        public static void Trappingwater(int number[]){
         int n=number.length;
         //left boundary
         int leftbound[]= new int[n];
         leftbound[0] = number[0];
         for(int i=1;i<n;i++){
            leftbound[i] = Math.max(number[i],leftbound[i-1]);
         }
         //right boundary
         int rightoud[]=new int[n];
         rightoud[n-1]=number[n-1];
         for(int i=n-2;i>=0;i--){
            rightoud[i]=Math.max(number[i],rightoud[i+1]);
         }
         //loop
         int trappped =0;
         for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftbound[i],rightoud[i]);
            trappped+=waterlevel-number[i];
         }
         System.out.println("the trapped water is"+trappped);
        }
       
        //buy stocks
        public static void sellbuystock(int number[]){
         int maxprofit =0;
         int buyprice = Integer.MAX_VALUE;
         for(int i=0;i<number.length;i++){
            if(buyprice<number[i])
           {
            int profit = number[i]-buyprice;
            maxprofit=Math.max(maxprofit, profit);
           }else{
            buyprice=number[i];
           }

         }
         System.out.println("the max profit is"+maxprofit);
        }

        //bubble sort
   public static void bubble(int number[]){
        int k = number.length-1;
        for(int i=0;i<k;i++){
         for(int j=0;j<k-i;j++){
               if(number[j]>number[j+1]){
                  int temp = number[j];
                  number[j]=number[j+1];
                  number[j+1] = temp;
               }
         }
      }
     for(int i=0;i<k;i++){
      System.out.print(number[i] +" ");
     }     
   }

   //count sort

   public static void countingsort(int number[]){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<number.length;i++){
         largest = Math.max(largest,number[i]);
      }
      int count[] = new int [largest+1];
      for(int i=0;i<number.length;i++){
         count[number[i]]++;
      }
      int j=0;
      for(int i=0;i<count.length;i++){
         while(count[i]>0){
            number[j] =i ;
            j++;
            count[i]--;

         }
      }
      for(int i=0;i<number.length;i++){
         System.out.print((number[i]+" "));

      }
   }
   public static int fo(int arr[],int key,int i){
   if(i == arr.length){
      return -1;
   }
   if(arr[i]==key){
   return i;
   }
   return fo(arr, key, i+1);
   }
   public static int lo(int arr[],int key,int i){
      if(i == arr.length){
         return -1;
      }
      int loo = lo(arr, key, i+1);
      if(loo==-1&&arr[i]==key){
      return i;
      }
      return loo;
      }
     
      public static void lofo(int arr[],int key,int i){
      System.out.println("fo"+fo(arr, key, i));
      System.out.println("lo"+lo(arr, key, i));
     }




    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        //creation of array
        /*int marks[] = new int[100];
        System.out.println("Enter your marks");
         marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("phy "+marks[0]+"\n"+"chem "+marks[1]+"\n"+"bio "+marks[2]);
        int total = marks[0]+marks[1]+marks[2];   
        System.out.println("Total:"+total);
        int average = total/3;
        System.out.println("Average :"+average);
         marks[2] = 30;
         System.out.println(marks[2]);*/
         int number[]={7,5,5,3,6,4};
         //Linear Search
         //int key=6;
         //linearsearch
         /* 
        int search = linerSearch(number, key);
         if(search==-1){
            System.out.println("Not Found");
         }
         else{
            System.out.println("the key is "+search);
         }*/
        
         /*Largest  Arary
         System.out.println("the largest no is "+getlargest(numbers));*/
          
         /*Bineary Search
         System.out.println("The number is"+BinearySearch(number,key));*/

        /*  reversearray(number);
         for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
         }
         System.out.println();*/
         
         //pairs(number);
         //subarray(number);
         //-minmaxsub(number);
         //prefixsub(number);
         // kadanes(number);
         //kadanesown(number);
         //Trappingwater(number);
         //sellbuystock(number);
         //bubble(number);

         //countingsort(number);
        /*   int flag=0;
         int sum = sc.nextInt();
         int n = sc.nextInt();
         int ele[] = new int[n];
         for(int i=0;i<n;i++)
         {
            ele[i] = sc.nextInt();
         }
         for(int i=0;i<n-1;i++)
         {
            for(int j=i+1;j<n;j++){
               if(ele[i]+ele[j]==sum){
                  System.out.println("array has two element"+i+" "+j );
                  flag =1;
                  break;
               }
            }
            if(flag==1)
            break;
         }
         if(flag==0){
            System.out.println("not");
         }*/
          int n = sc.nextInt();
         int ele[] = new int[n];
         for(int i=0;i<n;i++)
         {
            ele[i] = sc.nextInt();
         }
         int key = sc.nextInt();
         int in = sc.nextInt();
      
           lofo(ele, key,in );

      }
   }

   


