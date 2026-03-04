public class Maximumelement {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
    
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);

        }
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println(num);
            }
        }
        System.out.println(map);
        int a=n/2;
        for(int i=0;i<map.get(Key);i++){
            if(map.get(key)>n){
                break;
                
            }
        }
        System.out.println(map.get(Key));

    }
    
    
    

    
}
