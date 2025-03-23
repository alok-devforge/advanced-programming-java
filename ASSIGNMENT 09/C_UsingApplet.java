import java.applet.Applet;
import java.awt.*;
public class C_UsingApplet extends Applet
{
    public void init(){
        setBackground(Color.WHITE);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(new Color(30, 144, 255));
        g.drawRect(50, 50, 100, 75);
        g.setColor(new Color(255, 99, 71));
        g.drawLine(50, 50, 200, 150);
        g.setColor(new Color(50, 205, 50));
        g.drawArc(250, 50, 100, 100, 0, 135);
    }
    
    public static void main(String[] args)
    {
        Frame frame = new Frame("Applet in a Frame");
        C_UsingApplet applet = new C_UsingApplet();
        frame.add(applet);
        frame.setSize(400, 250);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}