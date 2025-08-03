import java.util.Scanner;
public class Array_decending {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int temp;
        int arr[]=new int[5];
        System.out.println("Enter the array element..");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        System.out.println("Decending sorted matrix are..");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
