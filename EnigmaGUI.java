public class EnigmaGUI {
    private EnigmaFrame frame;
    private Enigma enigma;

    public EnigmaGUI() {
        frame = new EnigmaFrame();

        // ----------- ACTION LISTENERS --------------------------------
        // Encrypt Button
        frame.bEncrypt.addActionListener((e) -> {
            enigma = createEnigma();

            // runs enigma encrypt method
            String input = frame.tfInput.getText();
            String encryption = enigma.encrypt(input);

            // displays output
            frame.tfOutput.setText(encryption);
        });

        // Decrypt Button
        frame.bDecrypt.addActionListener((e) -> {
            enigma = createEnigma();

            // runs enigma decrypt method
            String input = frame.tfInput.getText();
            String decryption = enigma.decrypt(input);

            // displays output
            frame.tfOutput.setText(decryption);
        });
    }

    // ----------- HELPER FUNCTION --------------------------------
    // helper function for duplicated code
    // takes input from combos and initial position
    private Enigma createEnigma() {
        // rotor numbers
        int inner = (Integer) frame.cbInner.getSelectedItem();
        int middle = (Integer) frame.cbMiddle.getSelectedItem();
        int out = (Integer) frame.cbOut.getSelectedItem();
        String init = frame.tfInit.getText();

        enigma = new Enigma(inner, middle, out, init);
        return enigma;
    }

    // ----------- MAIN --------------------------------
    public static void main(String args[]) {
        EnigmaGUI gui = new EnigmaGUI();
    }
}
