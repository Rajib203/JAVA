public class getter_setter{
    public static void main(String[] args) {
        pen p1=new pen();//create a pen object clled p1
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        // System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.gettip());

        // System.out.println(p1.tip);
        // p1.color="yellow";
        // System.out.println(p1.getcolor());
        // Bankaccount myacc=new Bankaccount();
        // myacc.name="rajib";
        // // myacc.password="abcdw";
        // myacc.setpassword("acvcbvc");
    }
}
class pen{
    private String color;
    private int tip;

    String getcolor()
    {
        return this.color;
    }
    int gettip()
    {
        return this.tip;
    }

    void setcolor(String newcolor)
    {
        this.color=newcolor;
    }

    void settip(int newTip)
    {
        this.tip=newTip;
    }
}
// }
// class Bankaccount{
//     public String name;
//     private String password;
//     public void setpassword(String pwd)
//     {
//         password=pwd;
//     }
// }

