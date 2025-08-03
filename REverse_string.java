public class REverse_string {
    public static String reversed(String str)
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            result+=str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str="hello";
        System.out.println(reversed(str));
    }
}
