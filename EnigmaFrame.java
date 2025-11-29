import java.awt.*;
import javax.swing.*;
public class EnigmaFrame {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("CSCI2113 GUI Lab15");
        f.setSize(900, 600);
        f.setLocation(100, 100);
        


        Integer[] rotorNums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};


        // ----------- TOP PANEL --------------------------------
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 5, 10, 0));

        // Inner Panel
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lInner = new JLabel("Inner");
        JComboBox cbInner = new JComboBox<>(rotorNums);

        innerPanel.add(lInner);
        innerPanel.add(cbInner);
        
        // Middle Panel
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lMiddle = new JLabel("Middle");
        JComboBox cbMiddle = new JComboBox<>(rotorNums);

        middlePanel.add(lMiddle);
        middlePanel.add(cbMiddle);

        // Middle Panel
        JPanel outPanel = new JPanel();
        outPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lOut = new JLabel("Out");
        JComboBox cbOut = new JComboBox<>(rotorNums);

        outPanel.add(lOut);
        outPanel.add(cbOut);

        // Put all together in Top Panel
        topPanel.add(innerPanel);
        topPanel.add(middlePanel);
        topPanel.add(outPanel);
        f.add(topPanel, BorderLayout.NORTH);    //add after all top panels are made

            
        // ----------- END OF FRAME FILE --------------------------------
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
