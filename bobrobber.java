public class bobrobber {
    private static int print(int[] arr){
        if(arr.length==0){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        int prev=0;
        int prev1=0;
        for(int num:arr){
            int temp=prev;
            prev=Math.max(prev,num+prev1);
            prev1=temp;
        }
        return prev;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(print(arr));
    }
}
