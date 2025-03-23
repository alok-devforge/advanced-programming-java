import java.awt.*;
import java.awt.event.*;

public class D_MouseListener extends Frame implements MouseListener {
    
    public D_MouseListener() {
        super("AWT MouseListener Example");
        addMouseListener(this);
        setSize(400, 300);
        setLayout(new FlowLayout());
        add(new Label("Click, press, release or move the mouse inside this window."));
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed.");
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released.");
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the window.");
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the window.");
    }
    
    public static void main(String[] args) {
        new D_MouseListener();
    }
}