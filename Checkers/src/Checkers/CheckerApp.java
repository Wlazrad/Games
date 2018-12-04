package Checkers;

import javafx.application.Application;
import javafx.css.Match;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class CheckerApp extends Application {

    public static final int TITLE_SIZE = 100;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private Tile[][] board = new Tile[WIDTH][HEIGHT];

    private Group tileGroup= new Group();
    private Group pieceGroup = new Group();



    private Parent createContent(){
        Pane root = new Pane();
        root.setPrefSize(WIDTH*TITLE_SIZE,HEIGHT*TITLE_SIZE);
        root.getChildren().addAll(tileGroup, pieceGroup);

        for (int y=0;y<HEIGHT;y++){
            for(int x =0 ; x<WIDTH;x++) {
                Tile tile = new Tile((x + y) % 2 == 0, x, y);
                board[x][y] = tile;
                tileGroup.getChildren().add(tile);
                Piece piece = null;

                if (y<= 2 && (x+y) %2 !=0){
                    piece = makePiece(PieceType.RED,x,y);
                }
                if ( y>= 5 && (x+y) %2 !=0){
                    piece = makePiece(PieceType.WHITE, x,y);
                }
                if (piece !=null) {
                    tile.setPiece(piece);
                    pieceGroup.getChildren().add(piece);
                }
            }
        }
        return root;
    }
private MoveResult tryMove(Piece piece, int newX, int newY) {
    if (board[newX][newY].hasPiece() || (newX + newY) % 2 == 0) {
        return new MoveResult(MoveType.NONE);
    }
    int x0 =toBoard(piece.getOldX());
    int y0 = toBoard(piece.getOldY());
    if (Math.abs(newX-x0)==1&& newY-y0==piece.getType().moveDir){
        return new MoveResult(MoveType.NORMAL);
    }else if (Match.abs(newX-x0)==2&&newY-y0==piece.getType().moveDir*2){
        int x1 =x0 + (newX-x0)/2;

    }
}
private int toBoard(double pixel){
        return (int)(pixel+TITLE_SIZE/2)/TITLE_SIZE;
}

    @Override
    public void start(Stage primaryStage) throws Exception {
Scene scene = new Scene(createContent());
primaryStage.setTitle("CheckersApp");
primaryStage.setScene(scene);
primaryStage.show();
    }
    private Piece makePiece(PieceType type, int x, int y){
        Piece piece = new Piece (type , x, y);
        piece.setOnMouseDragReleased(e->{

        });
        return piece;
    }
    public static void main(String[] args) {launch(args);}


    }

