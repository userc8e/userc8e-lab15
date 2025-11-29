public class EnigmaGUI {
    private EnigmaFrame frame;
    private Enigma enigma;

    public EnigmaGUI() {
        frame = new EnigmaFrame();

        // ----------- ACTION LISTENERS --------------------------------
        // Encrypt Button
        frame.bEncrypt.addActionListener((e) -> {
            // rotor numbers
            int inner = (Integer) frame.cbInner.getSelectedItem();
            int middle = (Integer) frame.cbMiddle.getSelectedItem();
            int out = (Integer) frame.cbOut.getSelectedItem();
            String init = frame.tfInit.getText();
            String input = frame.tfInput.getText();

            // runs enigma encrypt method
            enigma = new Enigma(inner, middle, out, init);
            String encryption = enigma.encrypt(input);

            // displays output
            frame.tfOutput.setText(encryption);
        });

        // Decrypt Button
        frame.bDecrypt.addActionListener((e) -> {
            // rotor numbers
            int inner = (Integer) frame.cbInner.getSelectedItem();
            int middle = (Integer) frame.cbMiddle.getSelectedItem();
            int out = (Integer) frame.cbOut.getSelectedItem();
            String init = frame.tfInit.getText();
            String input = frame.tfInput.getText();

            // runs enigma encrypt method
            enigma = new Enigma(inner, middle, out, init);
            String decryption = enigma.decrypt(input);

            // displays output
            frame.tfOutput.setText(decryption);
        });
    }

}
