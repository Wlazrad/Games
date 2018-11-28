package Checkers;

import java.awt.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Tile extends Rectangle {
    private Piece piece;
    public boolean hasPiece(){
        return piece !=null;
    }
    public Piece getPiece(){
        return piece;
    }
    public void setPiece(Piece piece){
        this.piece=piece;
    }
    public Tile (boolean light, int x, int y){
        setWidth(CheckerApp.TITLE_SIZE);
        setHeight(CheckerApp.TITLE_SIZE);

        relocate(x*CheckerApp.TITLE_SIZE, y*CheckerApp.TITLE_SIZE);

        setFill(light ? Color.valueOf("#feb"): Color.valueOf("#582"));

    }
}
