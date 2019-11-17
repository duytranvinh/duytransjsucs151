import javax.swing.*;
import java.awt.*;

public class MoveShape extends JLabel implements Runnable {
    //private JLabel label;
    private MoveableShape shape;
    private int DELAY;
    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    public MoveShape(MoveableShape s, int n){
        shape = s;
        ShapeIcon i = new ShapeIcon(s,
                ICON_WIDTH, ICON_HEIGHT);
        DELAY = n;
        setIcon(i);
    }
    @Override
    public void run(){
        try{
            Timer t = new Timer(DELAY, event ->
            {
                shape.move();
                repaint();
            });
            t.start();
            Thread.sleep(100);
        }catch(InterruptedException e){}

    }
    //public JLabel getLabel(){return label;}
}
