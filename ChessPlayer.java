package Interfaces;
interface ChessPlayerr{
    void moves();
}
class Queen implements ChessPlayerr{
    public void moves(){
        System.out.println("up,down,Left,Right,Diagonal-4 sides");
    }
}
class Hati implements ChessPlayerr{
public void moves(){
        System.out.println("up,down,Left,Right");
        }
        }
class King implements ChessPlayerr{
    public void moves(){
        System.out.println("up,down,Left,Right-1 diagonal");
    }
}
class otha implements ChessPlayerr{
    public void moves(){
        System.out.println("diagonal-4 sides");
    }
}

public class ChessPlayer {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        King k=new King();
        k.moves();
        otha o=new otha();
        o.moves();
        Hati h=new Hati();
        h.moves();
    }

}
