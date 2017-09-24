import javax.swing.JFrame;
public class SPRunner 
{
    public static void main(String[] args) 
    {
        int width = 500;
        int height = 500;
        SimplePanel panel = new SimplePanel(width, height);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}