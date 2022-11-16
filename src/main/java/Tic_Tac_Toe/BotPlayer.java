package Tic_Tac_Toe;

import Tic_Tac_Toe.Strategies.PlayingStrategy;

public class BotPlayer extends Player{

    private BotLevel level;
    private PlayingStrategy playingStrategy;

    public BotPlayer(GameSymbol symbol, BotLevel level){
        super(symbol);
        this.level = level;
    }

    @Override
    public BoardCell play(Board board) {
        return null;
    }
}
