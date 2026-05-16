import java.util.Scanner;

public class two_toend {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
             arr[pos++]=arr[i];
            }
        }
        while(pos<n){
            arr[pos++]=0;
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}
