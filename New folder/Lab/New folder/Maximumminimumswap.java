import java.util.Scanner;

public class Maximumminimumswap {
    
        public static void main(String[] args) {
            int[][]arr=new int[3][3];
            int[][]array=new int[3][3];
            int[][]temp=new int[3][3];
            Scanner sc=new Scanner(System.in);
            int max= arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0; j<arr[0].length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            
            for(int i=0;i<arr.length;i++){
                for(int j=0; j<array[0].length;j++){
                    if(max<arr[i][j])
                    max=arr[i][j];
                    
                }
                System.out.println("the maximum elent is"+max);
            }
            for(int i=0;i<arr.length;i++){
                for(int j=0; j<arr[0].length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int min=arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0; j<array[0].length;j++){
                    if(min>arr[i][j])
                    min=arr[i][j];
                    
                }
                System.out.println("the maximum elent is"+min);
            }
             temp[0][0]=max[i][j];
            max[i][j]=min[i][j];
            min[i][j]=temp[0][0];

            for(int i=0;i<arr.length;i++){
                for(int j=0; j<arr[0].length;j++){
                    System.out.print(arr[i][j]);
                }
            }

            


            


            System.out.println(max);
            System.out.println(min);
        
    }
    
}

