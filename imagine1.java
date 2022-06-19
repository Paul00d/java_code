import javax.swing.*;
 
public class Drawing {
    public Drawing() {
        JFrame frame = new JFrame("Display Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = (JPanel)frame.getContentPane();
 
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("imagine.jpg"));// your image here
        panel.add(label);
 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Drawing();
            }
        });
    }
}