  public class product_subArray {
    
  public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
      System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr){
        int n = arr.length;
        int maxProd  =arr[0];
        int currMax=arr[0];
        int currMin=arr[0];
        for(int i=1;i<n;i++){
    int temp =0;

            if (arr[i] >= arr[i] + currMax && arr[i] >= arr[i] + currMin) {
                temp = arr[i];
            } else if (arr[i] + currMax >= arr[i] && arr[i] + currMax >= arr[i] + currMin) {
                temp = arr[i] + currMax;
            } else {
                temp = arr[i] + currMin;
            }
            if (arr[i] <= arr[i] + currMax && arr[i] <= arr[i] + currMin) {
                currMin = arr[i];
            } else if (arr[i] + currMax <= arr[i] + currMax && arr[i] + currMax <= arr[i] + currMin) {
                currMin = arr[i] + currMax;
            } else {
                currMin = arr[i] + currMin;
            }
            currMax= temp;

            if(currMax>maxProd)
                maxProd=currMax;
        }
        return maxProd;
    }
}