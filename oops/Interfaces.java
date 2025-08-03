public class Interfaces {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
    }
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("Queen moves all direction..");
    }

}
class elephant implements chessplayer{
    public void moves(){
        System.out.println("diagonali..");
    }
}
class boat implements chessplayer{
    public void moves(){
        System.out.println("Starightly..");

    }
}