import java.awt.*;
import javax.swing.*;
public class EnigmaFrame {
    // Variables for action listeners in EnigmaGUI
    public JComboBox<Integer> cbInner;
    public JComboBox<Integer> cbMiddle;
    public JComboBox<Integer> cbOut;
    public JTextField tfInit;
    public JButton bEncrypt;
    public JButton bDecrypt;
    public JTextField tfInput;
    public JTextField tfOutput;


    // Frame Setup
    public EnigmaFrame() {
        JFrame f = new JFrame();
        f.setTitle("CSCI2113 GUI Lab15");
        f.setSize(1000, 600);
        f.setLocation(100, 100);
    

        // ----------- TOP PANEL --------------------------------
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 6, 10, 0));

        Integer[] rotorNums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

        // Inner Panel
        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lInner = new JLabel("Inner");
        cbInner = new JComboBox<>(rotorNums);

        innerPanel.add(lInner);
        innerPanel.add(cbInner);
        
        // Middle Panel
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lMiddle = new JLabel("Middle");
        cbMiddle = new JComboBox<>(rotorNums);

        middlePanel.add(lMiddle);
        middlePanel.add(cbMiddle);

        // Out Panel
        JPanel outPanel = new JPanel();
        outPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lOut = new JLabel("Out");
        cbOut = new JComboBox<>(rotorNums);

        outPanel.add(lOut);
        outPanel.add(cbOut);

        // Initial Positions Panel
        JPanel initPanel = new JPanel();
        initPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lInit = new JLabel("Initial Positions");
        tfInit = new JTextField();
        tfInit.setPreferredSize(new Dimension(30, 20));

        initPanel.add(lInit);
        initPanel.add(tfInit);

        // Encrypt Panel
        JPanel encryptPanel = new JPanel();
        encryptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        bEncrypt = new JButton("Encrypt");

        encryptPanel.add(bEncrypt);

        // Decrypt Panel
        JPanel decryptPanel = new JPanel();
        decryptPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        bDecrypt = new JButton("Decrypt");

        decryptPanel.add(bDecrypt);

        // Put all together in Top Panel
        topPanel.add(innerPanel);
        topPanel.add(middlePanel);
        topPanel.add(outPanel);
        topPanel.add(initPanel);
        topPanel.add(encryptPanel);
        topPanel.add(decryptPanel);
        f.add(topPanel, BorderLayout.NORTH);    //add topPanel to top of frame


        // ----------- INPUT/OUTPUT PANEL --------------------------------
        JPanel ioPanel = new JPanel();
        ioPanel.setLayout(new GridLayout(2, 1, 10, 0));

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JLabel lInput = new JLabel("Input ");
        tfInput = new JTextField();
        tfInput.setPreferredSize(new Dimension(100, 30));

        inputPanel.add(lInput, BorderLayout.WEST);
        inputPanel.add(tfInput, BorderLayout.CENTER);
        //f.add(inputPanel, BorderLayout.CENTER);

        // Output Panel
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());

        JLabel lOutput = new JLabel("Output ");
        tfOutput = new JTextField();
        tfOutput.setPreferredSize(new Dimension(100, 30));

        outputPanel.add(lOutput, BorderLayout.WEST);
        outputPanel.add(tfOutput, BorderLayout.CENTER);
        //f.add(outputPanel, BorderLayout.SOUTH);

        // Put all together in Input/Output Panel
        ioPanel.add(inputPanel);
        ioPanel.add(outputPanel);
        f.add(ioPanel, BorderLayout.CENTER);


        // ----------- END OF FRAME FILE --------------------------------
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
