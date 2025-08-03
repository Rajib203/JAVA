import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("rajib");
        Name.add("Rabiya");
        System.out.println(Name);
        Name.addFirst("ROJINA");
        System.out.println(Name);
        Name.removeFirst();
        System.out.println(Name);
        

    }
}
