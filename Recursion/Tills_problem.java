package Recursion;

public class Tills_problem {
    public static int tillingproblem(int n)//2xn floor size
    {
        //Base case 
        if(n==0 || n==1)
        {
            return 1;//1 possible way to fill the tiles
        }
        int fnm1=tillingproblem(n-1);//for vertical arrange of tile
        int fnm2=tillingproblem(n-2);//for horizontal 
        int totalways=fnm1+fnm2;
        return totalways;
    }
    
    public static void main(String[] args) {
        System.out.println("Total ways to arrange Tiles in Floor: "+tillingproblem(3));
    }
}
