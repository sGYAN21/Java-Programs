import java.util.Scanner;

public class Arrayrotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int Temp=0;
       int Start=0;
       int End=n-1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of k");
       int K=sc.nextInt();
     for(int i=0;i<n;i++){  
        while(Start<End){
            
        Temp=arr[Start];
        arr[Start]=arr[End];
        arr[End]=Temp;
        Start++;
        End--;
            }
        }
     for(int i;i<n;i++){
        System.out.print(arr[i]);
     } 
     for(j=0;j<=K-1;j++){
        while(Start<End){
            
            Temp=arr[Start];
            arr[Start]=arr[End];
            arr[End]=Temp;
            Start++;
            End--;
                }
            }
     for(int j=K;j<n-1;j++){
        System.out.print(arr[j]);
     }
     for(j=0;j<=K-1;j++){
        System.out.print(arr[j]);
     }
     for(j=k;j<n-1;j++){
        while(Start<End){
            
            Temp=arr[Start];
            arr[Start]=arr[End];
            arr[End]=Temp;
            Start++;
            End--;
                }
            }
     }
    


     }      
        

        
    
    

