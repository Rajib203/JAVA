public class sum_average_arary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;double avg;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("The sum xof array is.."+sum);
        avg=sum/arr.length;
        System.out.println("The average is.."+avg);
    }
}
