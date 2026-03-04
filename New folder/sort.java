public class sort {
    public static void main(String[] args) {
       // int[] arr={0,1,0,0,0,1,1,0};
       int [] arr={0,1,0,2,2,1,1,0};
        int c=0,d=0;
        for(int i=0;i<arr.length;i++)
        {  
            if(arr[i]==0)
                c+=1;
            if(arr[i]==1){
                d+=1;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j<c)
            {
                arr[j]=0;
            }
            else if(j<d){
                arr[j]=1;
            }else{
                arr[j]=2;
            }
        }
        for(int i=0;i<arr.length;i++)
        { 
            System.out.print(arr[i]);
        } 
    }
}
