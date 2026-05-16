public class RemoveVowels {
    public static void main(String[] args){
        String str="Hello World";
        String result=str.replaceAll("[AEIOUaeiou]", "");
        System.out.println(result);
    }
}
