import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        int[][]arr=new int[3][3];
        int[][]array=new int[3][3];
        int max= arr[0][0];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
    
            for(int j=0; j<array[0].length;j++){
                if(max<arr[i][j])
                max=arr[i][j];
                
            }
            System.out.println("the maximum elent is"+max);
        }
        

    }
    
}
