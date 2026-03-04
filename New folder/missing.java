public class missing {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr.length;
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int sym=totalsum-sum;
        System.out.println("Missing: "+sym);
        

    }
    
}
