import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        int ele=list.get(0);
        System.out.println(ele);
        list.set(0, 4);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));

        }
        
    }
}
