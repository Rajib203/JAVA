public class Leapyear{
    public static void main(String[] args) {
        int year=2028;
        boolean isLeapyear;
        isLeapyear=year%4==0;
        isLeapyear=isLeapyear &&(year%100!=0 || year%400==0);
        if(isLeapyear)
        {
            System.out.println(year+"is a leapyear");
        }
        else
        {
            System.out.println(year+"not leapy");
        }
    }
}