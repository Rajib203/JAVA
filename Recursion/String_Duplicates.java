package Recursion;

public class String_Duplicates {
    public static void removeduplicates(int idx,StringBuilder newstr,boolean map[],String str){
        if(idx==str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            removeduplicates(idx+1, newstr, map, str);
        }
        else{
            map[currchar-'a']=true;
            removeduplicates(idx, newstr.append(currchar), map, str);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        removeduplicates(0, new StringBuilder(""), new boolean[26], str);
    }
}
//Tuf
// import java.util.*;
 
// class Main {
//   public static String removeDuplicateLetters(String s) {
 
//     String ans = "";
//     for (int i = 0; i < s.length(); i++) {
//       int j = 0;
//       for (j = 0; j < i; j++) {
//         if (s.charAt(i) == s.charAt(j)) //same character found
//         {
//           break;
//         }
//       }
//       if (i == j) {
//         ans += s.charAt(i);
//       }
//     }
//     return ans;
//   }
//   public static void main(String[] args) {
//     String str = "cbacdcbc";
//     System.out.println("Original String: "+str);
//     System.out.println("After removing duplicates: "+removeDuplicateLetters(str));
 
//   }
// }