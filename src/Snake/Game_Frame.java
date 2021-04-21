package Snake;

import javax.swing.*;
import java.awt.*;

public class Game_Frame extends JFrame {

    Game_Frame() {

        Game_Panel panel = new Game_Panel();

        this.add(new Game_Panel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);




    }



}
