public class countpath {
    public static int countPath(int n,int m,int i,int j){
       
        if(i>=n&&j>=m){
            return 1; 
        }
        if(i==n-1 || j==m-1){
            return 1;
        }
        int rightPath=countPath(n, m, i, j+1);
        int downPath=countPath(n, m, i+1, j);
        return rightPath+downPath;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int x=countPath(n,m,0,0);
        System.out.println(x);
    }
}
