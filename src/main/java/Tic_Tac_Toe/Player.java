package Tic_Tac_Toe;

public abstract class Player {
    private GameSymbol symbol;

    public Player(GameSymbol symbol) {
        this.symbol = symbol;
    }

    public abstract BoardCell play(Board board);
}
