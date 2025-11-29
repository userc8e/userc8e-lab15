import java.awt.*;
import javax.swing.*;
public class EnigmaFrame {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("CSCI2113 GUI Lab15");
        f.setSize(1000, 600);
        f.setLocation(100, 100);
        


        Integer[] rotorNums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};


        // ----------- TOP PANEL --------------------------------
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 6, 10, 0));

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

        // Out Panel
        JPanel outPanel = new JPanel();
        outPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lOut = new JLabel("Out");
        JComboBox cbOut = new JComboBox<>(rotorNums);

        outPanel.add(lOut);
        outPanel.add(cbOut);

        // Initial Positions Panel
        JPanel initPanel = new JPanel();
        initPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lInit = new JLabel("Initial Positions");
        JTextField tfInit = new JTextField();
        tfInit.setPreferredSize(new Dimension(30, 20));

        initPanel.add(lInit);
        initPanel.add(tfInit);

        // Encrypt Panel
        JPanel encryptPanel = new JPanel();
        encryptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton bEncrypt = new JButton("Encrypt");

        encryptPanel.add(bEncrypt);

        // Decrypt Panel
        JPanel decryptPanel = new JPanel();
        decryptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton bDecrypt = new JButton("Decrypt");

        decryptPanel.add(bDecrypt);

        // Put all together in Top Panel
        topPanel.add(innerPanel);
        topPanel.add(middlePanel);
        topPanel.add(outPanel);
        topPanel.add(initPanel);
        topPanel.add(encryptPanel);
        topPanel.add(decryptPanel);
        f.add(topPanel, BorderLayout.NORTH);    //add topPanel to top of frame

            
        // ----------- END OF FRAME FILE --------------------------------
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
