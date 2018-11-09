import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        new Figuras();
    }
}

abstract class Shape extends JFrame
{
    JPanel[] pnl = new JPanel[20];
    public Shape()
    {
        setLayout(new GridLayout(4,5));
        for(int i = 0; i < pnl.length ; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
            setVisible(true);
        }
        setSize(800,500);
    }
}
class Figuras extends Shape {
    // т.к. я не могу определить сразу абстратный класс, я решил реализовать через наследсвтенный класс "Figuras"
}
