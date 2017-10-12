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
        g.setColor(Color.blue);
        width = getWidth();
        height = getHeight();
        g.drawLine(0, height/2, width, height/2);
        g.drawLine(width/2, height, width/2, 0);
        g.setColor(Color.green);
        g.drawRect(125/2, height/2+62 , 125, 100);
        g.setColor(Color.red);
        g.fillRect(width/2+62, height/2+62 , 125, 100);
        g.setColor(Color.orange);
        g.drawOval(width/2+62, height/6, 125, 100);
        g.setColor(Color.white);
        g.fillOval(125/2, height/6 , 125, 100);
        
    }
}