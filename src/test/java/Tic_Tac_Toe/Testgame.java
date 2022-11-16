package Tic_Tac_Toe;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Testgame {
    private Game game;

    @Before
    public void setGame(){
        this.game = createGame();
    }

    private Game createGame() {
        User user = new User("alex", "09@mail", new byte[]{});
        Player humanPlayer = new HumanPlayer(GameSymbol.O, user);
        Player botPlayer = new BotPlayer(GameSymbol.X, BotLevel.EASY);

        List<Player> players = new ArrayList<>();
        players.add(humanPlayer);
        players.add(botPlayer);

        return Game.createGame(players, 3, 3);
    }

    @Test
    public void testDimension(){
        List<List<BoardCell>> cells = game.getBoard().getCells();
        assertEquals(3, cells.size());

        List<BoardCell> firstRow = cells.get(0);
        assertEquals(3, firstRow.size());
    }
}
