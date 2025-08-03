public class palindrome_new {
    public static void main(String[] args) {
        String str="mom";
        String newstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            newstr+=str.charAt(i);//At first i reversed the String 
            
        }
        System.out.println(newstr);
        if(str.equals(newstr))//Then i check reverse is equal of str or not
        {
            System.out.println("palindrome..");
        }
        else{
            System.out.println("Not a palindrome...");
        }
        
    }
}
