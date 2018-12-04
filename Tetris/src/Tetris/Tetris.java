package Tetris;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Tetris extends JPanel {

    static Tetris tetris = new Tetris();
    static JFrame okno = new JFrame("Tetris");

    Tetris()
    {
        super();
        setBackground(Color.BLACK);
        setLayout(null);
    }

    public static void main(String[] args) {
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.add(tetris);
        okno.setSize(600,600);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
        okno.setVisible(true);



    }
}
