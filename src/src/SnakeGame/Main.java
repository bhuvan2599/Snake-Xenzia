package SnakeGame;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JFrame frame;

    Main(){
        frame = new JFrame("Snake Xenzia");
        frame.setBounds(10,10,905,700);
        frame.setResizable(false);
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}