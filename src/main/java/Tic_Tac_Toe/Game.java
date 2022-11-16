package Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public static Game createGame(List<Player> players, int rows, int columns) {
        Board board = new Board(rows, columns);
        Game game = new Game(board, players);
        return game;
    }

    public void makeMove(Player incomingPlayer, int row, int column) {
        incomingPlayer.play(board);

    }
}
