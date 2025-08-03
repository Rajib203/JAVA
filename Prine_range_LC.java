public class Prine_range_LC {
    public static void main(String[] args) {
        int n1=10,n2=100,i,j;
        for(i=n1;i<=n2;i++){
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j){
                System.out.print(j+" ");
            }
        }
    }
}
