public class Anagram{
    public static void main(String[] args){
        String s1="listen";
        String s2="silnt";

        char [] a1=s1.toCharArray();
        char [] a2=s2.toCharArray();
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);
        if(java.util.Arrays.equals(a1, a2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}