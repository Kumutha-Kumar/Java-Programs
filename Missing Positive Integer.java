public class Quick {
    public static void main(String[] args) {
        int n=5;
        int[] arr ={5,4,3,1};
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        int current=0;
        for(int j=1;j<=n;j++){
           current=current+j;
        }
        System.out.println(current-sum);

    }
}
