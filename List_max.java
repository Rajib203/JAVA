import java.util.ArrayList;

public class List_max {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max, list.get(i));

        }
        System.out.println("The maximum list element is "+max);
    }
}
