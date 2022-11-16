package Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int rows, int column){
        //{1, 2, 3, 4}
        //{1, 2, 3, 4}
        //{1, 2, 3, 4}
        //it does this
        List<BoardCell> columnCells = Collections.nCopies(column, new BoardCell());
        List<List<BoardCell>> rowCells = Collections.nCopies(rows, columnCells);
        this.cells = rowCells;

    }

    public List<List<BoardCell>> getCells() {
        return cells;
    }
}
