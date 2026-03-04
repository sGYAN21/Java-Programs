import java.util.Scanner;
class Max_min{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("How many numbrers You Want to enter :");
    int n=sc.nextInt(); 
    int arr[]=new int[n];
    for (int i=0;i<n;i++)
      {
        System.out.print("Enter "+(i+1)+"Number :");
        arr[i]=sc.nextInt();
      }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
      {
        if(arr[i]<min)
          {min=arr[i];}
       if(arr[i]>max)
       {
        max=arr[i];
       }
      }
    System.out.println("Min:"+min);
    System.out.println("Max:"+max);
    int totalsum=0;
    for(int i=min;i<max;i++)
    {
        totalsum+=i;
    }
    System.out.println("Totalsum : "+totalsum);
    int arrsum=0;
    for(int i=0;i<arr.length;i++)
    {
        arrsum+=arr[i];
    }
    int missing=totalsum-arrsum;
    System.out.println("The missing number is :"+missing);
    sc.close();

  }
}
 