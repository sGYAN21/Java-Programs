import java.util.Scanner;
public class Minimun {
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int scMax=Integer.MIN_VALUE;
        System.out.println("Enter the 5-numbers :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           max=arr[i];
        
        }
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>scMax && arr[i]!=max)
           {scMax=arr[i];}
        
        }
        System.out.println("The Max element is :"+max);
        System.out.println("The Second Max Element is :"+scMax);
        sc.close();
    }
} 
