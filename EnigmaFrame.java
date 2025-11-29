import java.awt.*;
import javax.swing.*;
public class EnigmaFrame {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("CSCI2113 GUI Lab15");
        f.setSize(900, 600);
        f.setLocation(100, 100);
        


        Integer[] rotorNums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};


        // TOP PANEL
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        // Inner Panel
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());

        JLabel lInner = new JLabel("Inner");
        JComboBox cbInner = new JComboBox<>(rotorNums);

        innerPanel.add(lInner, BorderLayout.WEST);
        innerPanel.add(cbInner, BorderLayout.EAST);
        
        // Middle Panel
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());

        JLabel lMiddle = new JLabel("Middle");
        JComboBox cbMiddle = new JComboBox<>(rotorNums);

        middlePanel.add(lMiddle, BorderLayout.WEST);
        middlePanel.add(cbMiddle, BorderLayout.EAST);

        // Middle Panel
        JPanel outPanel = new JPanel();
        outPanel.setLayout(new BorderLayout());

        JLabel lOut = new JLabel("Out");
        JComboBox cbOut = new JComboBox<>(rotorNums);

        outPanel.add(lOut, BorderLayout.WEST);
        outPanel.add(cbOut, BorderLayout.EAST);

        topPanel.add(innerPanel, BorderLayout.WEST);
        topPanel.add(middlePanel, BorderLayout.CENTER);
        topPanel.add(outPanel, BorderLayout.EAST);
        f.add(topPanel, BorderLayout.NORTH);    //add after all top panels are made

            
        // End of Frame file
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
