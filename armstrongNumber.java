public class armstrongNumber {
    public static void main(String[] args) {
        int n=1634;
        int dup=n;
        int sum=0;
        int len=String.valueOf(n).length();
        while(n>0){
            int power=n%10;
           sum+=Math.pow(power,len);
            n=n/10;
        }
        if(dup==sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
