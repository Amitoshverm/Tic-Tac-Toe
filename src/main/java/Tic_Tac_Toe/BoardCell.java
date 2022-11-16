package Tic_Tac_Toe;

public class BoardCell {
    private Integer rows;
    private Integer col;
    private GameSymbol symbol;

    public BoardCell(Integer rows, Integer col, GameSymbol symbol) {
        this.rows = rows;
        this.col = col;
        this.symbol = symbol;
    }

    public BoardCell(){}

    public Integer getRows() {
        return rows;
    }

    public Integer getCol() {
        return col;
    }

    public GameSymbol getSymbol() {
        return symbol;
    }
}
