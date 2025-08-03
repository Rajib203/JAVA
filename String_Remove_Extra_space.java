public class String_Remove_Extra_space {
    public static void main(String[] args) {
        String str="Remove extra space";
        str=str.replaceAll("\\s+","");
        System.out.println("Extra space removed: "+str);
    }
}
