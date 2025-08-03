public class String_comapreTo {
    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};
        String largest=str[0];//initialize the largest as zero element
        for(int i=0;i<str.length;i++)
        {
            if(largest.compareTo(str[i])<0)//string compare by lexico graphically single word wise
            {
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
}
