public class Binarytodecimal {
//     public static void bintodec(int binNum)
//     {
//         int mynum=binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum>0)
//         {
//             int lastdigit=binNum%10;
//             decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
//             binNum=binNum/10;
//             pow++;
//         }
//         System.out.println("decimal of"+mynum+"is"+decNum);
//     }
//     public static void main(String[] args) {
//         bintodec(11);
//     }
// }
public static void dectobin(int n)
{
    int mynum=n;
    int binNum=0;
    int pow=0;
    while(n>0)
    {
        int rem=n%2;
         binNum=binNum+(rem*(int)Math.pow(10,pow));
         pow++;
         n=n/2;
    }
    System.out.println("binary of"+mynum+ "is"+binNum);
}
public static void main(String[] args)
{
    dectobin(10);
}
}