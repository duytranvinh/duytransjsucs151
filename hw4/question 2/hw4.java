import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 This program implements an animation that moves
 a car shape.
 */
public class hw4
{
    private ArrayList<MoveableShape> shapes;
    private ArrayList<ShapeIcon> icons;
    private JFrame mainFrame;
    private JPanel mainPanel;
    private int numOfCars;

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;

    public hw4(int n){
        numOfCars = n;

    }
    private void run()
    {
        shapes = new ArrayList<>(numOfCars);
        icons = new ArrayList<>(numOfCars);
        for(int i = 0; i < numOfCars; i++){
            MoveableShape aShape = new CarShape(i, (i+1)*10, CAR_WIDTH);
            shapes.add(aShape);
            icons.add(new ShapeIcon(aShape, ICON_WIDTH, ICON_HEIGHT));
        }
        prepareGUI();
    }
    private void prepareGUI(){
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300,400);
        for(int i = 0; i < numOfCars; i++){
            MoveShape m = new MoveShape(shapes.get(i),(i+1)*50);
            Thread aThread = new Thread(m);
            aThread.start();
            mainPanel.add(m);
        }

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
    	hw4 tester = new hw4(3);
    	tester.run();
    }
}
