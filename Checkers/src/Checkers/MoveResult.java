package Checkers;

public class MoveResult {
    private MoveType type;

    public MoveType getType(){
        return type;
    }
    public Piece piece;
    public Piece getPiece(){
        return piece;
    }
    public MoveResult(MoveType type){
        this(type, null);
    }
    public MoveResult(MoveType type, Piece piece){
        this.type =type;
        this.piece = piece;
    }
}
