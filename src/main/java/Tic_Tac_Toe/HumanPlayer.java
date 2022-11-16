package Tic_Tac_Toe;

public class HumanPlayer extends Player{

    private User user;


    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public BoardCell play(Board board) {
        System.out.println("human player playing");
        return null;
    }
}
