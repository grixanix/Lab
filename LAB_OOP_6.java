import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class Main extends JFrame {
    Main() {
        super("Лабораторная работа 6");
        setSize(600, 400);
        // Панель содержимого
        Container container = getContentPane();
        JButton buttonNorth = new JButton("NORTH");
        container.add(buttonNorth, BorderLayout.NORTH);
        buttonNorth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonNorth.setToolTipText("Добро пожаловать в ");
            }@Override
            public void mouseExited(MouseEvent e) {
            }
        });
        JButton buttonWest = new JButton("WEST");
        container.add(buttonWest, BorderLayout.WEST);
        buttonWest.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonWest.setToolTipText("Добро пожаловать в Джидда");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        JButton buttonCenter = new JButton("CENTER");
        container.add(buttonCenter, BorderLayout.CENTER);
        buttonCenter.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonCenter.setToolTipText("Добро пожаловать в ");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        JButton buttonEast = new JButton("East");
        container.add(buttonEast, BorderLayout.EAST);
        buttonEast.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonEast.setToolTipText("Добро пожаловать в Дахране");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        JButton buttonSouth = new JButton("SOUTH");
        container.add(buttonSouth, BorderLayout.SOUTH);
        buttonSouth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                buttonSouth.setToolTipText("Добро пожаловать в Абха");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
