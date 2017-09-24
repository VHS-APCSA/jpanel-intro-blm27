import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class SimplePanel extends JPanel 
{
    private int width;
    private int height;
    public SimplePanel() 
    {
        width = 0;
        height = 0;
    }
    public SimplePanel(int width, int height)
    {
        this.width = width;
        this.height = height;
        setBackground(Color.black);
    }
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        width = getWidth();
        height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}