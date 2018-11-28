package Checkers;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import static Checkers.CheckerApp.TITLE_SIZE;

public class Piece extends StackPane {
    private PieceType type;

    public PieceType getType(){
        return type;
    }

    public Piece (PieceType type, int x, int y){
        this.type = type;
        relocate(x*TITLE_SIZE,y*TITLE_SIZE);
//modyfikacja elipsy
        Ellipse bg = new Ellipse(TITLE_SIZE * 0.3125, TITLE_SIZE*0.26);
        bg.setFill(Color.BLACK);

        bg.setStroke(Color.BLACK);
        bg.setStrokeWidth(TITLE_SIZE * 0.03);

        bg.setTranslateX((TITLE_SIZE - TITLE_SIZE *0.3125 *2)/2);
        bg.setTranslateY((TITLE_SIZE - TITLE_SIZE *0.26 *2)/2+TITLE_SIZE*0.07);

        Ellipse ellipse = new Ellipse(TITLE_SIZE*0.3125,
                TITLE_SIZE*0.26);
        ellipse.setFill(type == PieceType.RED?
                Color.valueOf("#c40003"):Color.valueOf("#fff9f4"));

        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(TITLE_SIZE*0.03);

        ellipse.setTranslateX((TITLE_SIZE-TITLE_SIZE*0.3125*2)/2);
        ellipse.setTranslateY((TITLE_SIZE-TITLE_SIZE*0.26*2)/2);

        getChildren().addAll(bg, ellipse);
    }
}
