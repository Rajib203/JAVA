public class Sliding_window {
    public static void main(String[] args) {
        int[] users={45,4,4,3,2,45,34,46};
        int days=3;
        int maxSum=0;
        for(int i=0;i<days;i++)
        {
            maxSum+=users[i];
        }
        System.out.println(maxSum);
        for(int i=1;i<=users.length-days;i++){
            maxSum=maxSum-users[i-1]+users[i+days-1];
        }
        System.out.println(maxSum);
    }
}
