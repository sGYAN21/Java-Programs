public class missing_no {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
                
                if(max<arr[i])
                {
                    max=arr[i];
                }
                if (min>arr[i])
                {
                    min=arr[i];
                }
                
        }
        int sum1=0;
        for (int i = min; i < max; i++) {
            sum1=sum1+i;
        }
        int ans=(sum1-sum);
        System.out.println(ans);
    }
}